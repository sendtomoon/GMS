package com.jy.common.utils.fastdfs;

import org.slf4j.*;
import java.util.*;
import java.util.concurrent.*;
import java.io.*;
import org.csource.fastdfs.*;

public class ConnectionPool
{
    private static final Logger logger;
    private static String configFile;
    private LinkedBlockingQueue<TrackerServer> idleConnectionPool;
    private long minPoolSize;
    private long maxPoolSize;
    private volatile long nowPoolSize;
    private long waitTimes;
    private static final int COUNT = 1;
    
    static {
        logger = LoggerFactory.getLogger((Class)ConnectionPool.class);
        ConnectionPool.configFile = "/fdfs_client.conf";
        try {
            final String classPath = new File(ConnectionPool.class.getResource("/").getFile()).getCanonicalPath();
            ConnectionPool.configFile = String.valueOf(classPath) + File.separator + ConnectionPool.configFile;
        }
        catch (Exception e) {
            ConnectionPool.logger.error("\u83b7\u53d6\u6839\u8def\u5f84\u51fa\u9519", (Throwable)e);
        }
    }
    
    public ConnectionPool(final long minPoolSize, final long maxPoolSize, final long waitTimes) {
        this.idleConnectionPool = null;
        this.minPoolSize = 10L;
        this.maxPoolSize = 30L;
        this.nowPoolSize = 0L;
        this.waitTimes = 200L;
        final String logId = UUID.randomUUID().toString();
        ConnectionPool.logger.info("[\u7ebf\u7a0b\u6c60\u6784\u9020\u65b9\u6cd5(ConnectionPool)][" + logId + "][\u9ed8\u8ba4\u53c2\u6570\uff1aminPoolSize=" + minPoolSize + ",maxPoolSize=" + maxPoolSize + ",waitTimes=" + waitTimes + "]");
        this.minPoolSize = minPoolSize;
        this.maxPoolSize = maxPoolSize;
        this.waitTimes = waitTimes;
        this.poolInit(logId);
        final HeartBeat beat = new HeartBeat(this);
        beat.beat();
    }
    
    private void poolInit(final String logId) {
        try {
            this.initClientGlobal();
            this.idleConnectionPool = new LinkedBlockingQueue<TrackerServer>();
            for (int i = 0; i < this.minPoolSize; ++i) {
                this.createTrackerServer(logId, 1);
            }
        }
        catch (Exception e) {
            ConnectionPool.logger.error("[FASTDFS\u521d\u59cb\u5316(init)--\u5f02\u5e38][" + logId + "][\u5f02\u5e38\uff1a{}]", (Throwable)e);
        }
    }
    
    public void createTrackerServer(final String logId, int flag) {
        ConnectionPool.logger.info("[\u521b\u5efaTrackerServer(createTrackerServer)][" + logId + "]");
        TrackerServer trackerServer = null;
        try {
            TrackerClient trackerClient;
            for (trackerClient = new TrackerClient(), trackerServer = trackerClient.getConnection(); trackerServer == null && flag < 5; trackerServer = trackerClient.getConnection()) {
                ConnectionPool.logger.info("[\u521b\u5efaTrackerServer(createTrackerServer)][" + logId + "][\u7b2c" + flag + "\u6b21\u91cd\u5efa]");
                ++flag;
                this.initClientGlobal();
            }
            ProtoCommon.activeTest(trackerServer.getSocket());
            this.idleConnectionPool.add(trackerServer);
            synchronized (this) {
                ++this.nowPoolSize;
            }
        }
        catch (Exception e) {
            ConnectionPool.logger.error("[\u521b\u5efaTrackerServer(createTrackerServer)][" + logId + "][\u5f02\u5e38\uff1a{}]", (Throwable)e);
            if (trackerServer != null) {
                try {
                    trackerServer.close();
                }
                catch (Exception e2) {
                    ConnectionPool.logger.error("[\u521b\u5efaTrackerServer(createTrackerServer)--\u5173\u95edtrackerServer\u5f02\u5e38][" + logId + "][\u5f02\u5e38\uff1a{}]", (Throwable)e2);
                }
            }
            return;
        }
        finally {
            if (trackerServer != null) {
                try {
                    trackerServer.close();
                }
                catch (Exception e2) {
                    ConnectionPool.logger.error("[\u521b\u5efaTrackerServer(createTrackerServer)--\u5173\u95edtrackerServer\u5f02\u5e38][" + logId + "][\u5f02\u5e38\uff1a{}]", (Throwable)e2);
                }
            }
        }
        if (trackerServer != null) {
            try {
                trackerServer.close();
            }
            catch (Exception e2) {
                ConnectionPool.logger.error("[\u521b\u5efaTrackerServer(createTrackerServer)--\u5173\u95edtrackerServer\u5f02\u5e38][" + logId + "][\u5f02\u5e38\uff1a{}]", (Throwable)e2);
            }
        }
    }
    
    public TrackerServer checkout(final String logId) {
        ConnectionPool.logger.info("[\u83b7\u53d6\u7a7a\u95f2\u8fde\u63a5(checkout)][" + logId + "]");
        TrackerServer trackerServer = this.idleConnectionPool.poll();
        if (trackerServer == null) {
            if (this.nowPoolSize < this.maxPoolSize) {
                this.createTrackerServer(logId, 1);
                try {
                    trackerServer = this.idleConnectionPool.poll(this.waitTimes, TimeUnit.SECONDS);
                }
                catch (Exception e) {
                    ConnectionPool.logger.error("[\u83b7\u53d6\u7a7a\u95f2\u8fde\u63a5(checkout)-error][" + logId + "][error:\u83b7\u53d6\u8fde\u63a5\u8d85\u65f6:{}]", (Throwable)e);
                }
            }
            if (trackerServer == null) {
                ConnectionPool.logger.error("[\u83b7\u53d6\u7a7a\u95f2\u8fde\u63a5(checkout)-error][" + logId + "][error:\u83b7\u53d6\u8fde\u63a5\u8d85\u65f6\uff08" + this.waitTimes + "s\uff09]");
            }
        }
        ConnectionPool.logger.info("[\u83b7\u53d6\u7a7a\u95f2\u8fde\u63a5(checkout)][" + logId + "][\u83b7\u53d6\u7a7a\u95f2\u8fde\u63a5\u6210\u529f]");
        return trackerServer;
    }
    
    public void checkin(final TrackerServer trackerServer, final String logId) {
        ConnectionPool.logger.info("[\u91ca\u653e\u5f53\u524d\u8fde\u63a5(checkin)][" + logId + "][prams:" + trackerServer + "] ");
        if (trackerServer != null) {
            if (this.idleConnectionPool.size() < this.minPoolSize) {
                this.idleConnectionPool.add(trackerServer);
            }
            else {
                synchronized (this) {
                    if (this.nowPoolSize != 0L) {
                        --this.nowPoolSize;
                    }
                }
            }
        }
    }
    
    public void drop(final TrackerServer trackerServer, final String logId) {
        ConnectionPool.logger.info("[\u5220\u9664\u4e0d\u53ef\u7528\u8fde\u63a5\u65b9\u6cd5(drop)][" + logId + "][parms:" + trackerServer + "] ");
        if (trackerServer != null) {
            try {
                synchronized (this) {
                    if (this.nowPoolSize != 0L) {
                        --this.nowPoolSize;
                    }
                }
                trackerServer.close();
            }
            catch (IOException e) {
                ConnectionPool.logger.info("[\u5220\u9664\u4e0d\u53ef\u7528\u8fde\u63a5\u65b9\u6cd5(drop)--\u5173\u95edtrackerServer\u5f02\u5e38][" + logId + "][\u5f02\u5e38\uff1a{}]", (Throwable)e);
            }
        }
    }
    
    private void initClientGlobal() throws Exception {
        ClientGlobal.init(ConnectionPool.configFile);
        ConnectionPool.logger.info("FastDfs\u521d\u59cb\u5316\u5b8c\u6210:" + ConnectionPool.configFile);
    }
    
    public LinkedBlockingQueue<TrackerServer> getIdleConnectionPool() {
        return this.idleConnectionPool;
    }
    
    public long getMinPoolSize() {
        return this.minPoolSize;
    }
    
    public void setMinPoolSize(final long minPoolSize) {
        if (minPoolSize != 0L) {
            this.minPoolSize = minPoolSize;
        }
    }
    
    public long getMaxPoolSize() {
        return this.maxPoolSize;
    }
    
    public void setMaxPoolSize(final long maxPoolSize) {
        if (maxPoolSize != 0L) {
            this.maxPoolSize = maxPoolSize;
        }
    }
    
    public long getWaitTimes() {
        return this.waitTimes;
    }
    
    public void setWaitTimes(final int waitTimes) {
        if (waitTimes != 0) {
            this.waitTimes = waitTimes;
        }
    }
}
