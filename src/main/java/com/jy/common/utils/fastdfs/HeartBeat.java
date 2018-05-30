package com.jy.common.utils.fastdfs;

import org.slf4j.*;
import org.csource.fastdfs.*;
import java.util.concurrent.*;
import java.util.*;

public class HeartBeat
{
    private static final Logger logger;
    private ConnectionPool pool;
    public static int ahour;
    public static int waitTimes;
    
    static {
        logger = LoggerFactory.getLogger((Class)HeartBeat.class);
        HeartBeat.ahour = 3600000;
        HeartBeat.waitTimes = 200;
    }
    
    public HeartBeat(final ConnectionPool pool) {
        this.pool = null;
        this.pool = pool;
    }
    
    public void beat() {
        HeartBeat.logger.info("[\u5fc3\u8df3\u4efb\u52a1\u65b9\u6cd5\uff08beat\uff09]");
        final TimerTask task = new TimerTask() {
            @Override
            public void run() {
                final String logId = UUID.randomUUID().toString();
                HeartBeat.logger.info("[\u5fc3\u8df3\u4efb\u52a1\u65b9\u6cd5\uff08beat\uff09][" + logId + "][Description:\u5bf9idleConnectionPool\u4e2d\u7684TrackerServer\u8fdb\u884c\u76d1\u6d4b]");
                final LinkedBlockingQueue<TrackerServer> idleConnectionPool = HeartBeat.this.pool.getIdleConnectionPool();
                TrackerServer ts = null;
                for (int i = 0; i < idleConnectionPool.size(); ++i) {
                    try {
                        ts = idleConnectionPool.poll(HeartBeat.waitTimes, TimeUnit.SECONDS);
                        if (ts == null) {
                            break;
                        }
                        ProtoCommon.activeTest(ts.getSocket());
                        idleConnectionPool.add(ts);
                    }
                    catch (Exception e) {
                        HeartBeat.logger.error("[\u5fc3\u8df3\u4efb\u52a1\u65b9\u6cd5\uff08beat\uff09][" + logId + "][\u5f02\u5e38\uff1a\u5f53\u524d\u8fde\u63a5\u5df2\u4e0d\u53ef\u7528\u5c06\u8fdb\u884c\u91cd\u65b0\u83b7\u53d6\u8fde\u63a5]", (Throwable)e);
                        HeartBeat.this.pool.drop(ts, logId);
                    }
                }
            }
        };
        final Timer timer = new Timer();
        timer.schedule(task, HeartBeat.ahour, HeartBeat.ahour);
    }
}
