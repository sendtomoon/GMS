package com.jy.common.utils;

import java.net.*;
import org.apache.commons.lang3.*;
import java.io.*;

public class FileUtil
{
    private static final char COLON_CHAR = ':';
    private static final String UNC_PREFIX = "//";
    private static final String SLASH = "/";
    private static final char SLASH_CHAR = '/';
    private static final char BACKSLASH_CHAR = '\\';
    public static final String CURRENT_DIR = ".";
    public static final String UP_LEVEL_DIR = "..";
    private static final char EXTENSION_SEPARATOR = '.';
    private static final char UNIX_SEPARATOR = '/';
    private static final char WINDOWS_SEPARATOR = '\\';
    private static final String TEMP_FILE_PREFIX = "temp_file_prefix-";
    
    public static File toFile(final URL url) {
        if (url == null) {
            return null;
        }
        if (!"file".equals(url.getProtocol())) {
            return null;
        }
        final String path = url.getPath();
        return (path != null) ? new File(path) : null;
    }
    
    public static boolean exist(final String path) {
        return path != null && new File(path).exists();
    }
    
    public static boolean exist(final File file) {
        return file != null && file.exists();
    }
    
    public static boolean exist(final String directory, final String regexp) {
        final File file = new File(directory);
        if (!file.exists()) {
            return false;
        }
        final String[] fileList = file.list();
        if (fileList == null) {
            return false;
        }
        String[] array;
        for (int length = (array = fileList).length, i = 0; i < length; ++i) {
            final String fileName = array[i];
            if (fileName.matches(regexp)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean isDirectory(final String path) {
        return path != null && new File(path).isDirectory();
    }
    
    public static boolean isDirectory(final File file) {
        return file != null && file.isDirectory();
    }
    
    public static boolean isFile(final String path) {
        return path != null && new File(path).isDirectory();
    }
    
    public static boolean isFile(final File file) {
        return file != null && file.isDirectory();
    }
    
    public static File[] listDirSuffixFiles(final File dir, final String suffix) {
        if (dir == null) {
            return null;
        }
        if (!dir.exists() || dir.isFile()) {
            return null;
        }
        return dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(final File file) {
                return StringUtils.isEmpty((CharSequence)suffix) || file.getName().endsWith(suffix);
            }
        });
    }
    
    public static File[] listDirSuffixFiles(final String dirPath, final String suffix) {
        if (!exist(dirPath)) {
            return null;
        }
        final File dir = new File(dirPath);
        return dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(final File file) {
                return StringUtils.isEmpty((CharSequence)suffix) || file.getName().endsWith(suffix);
            }
        });
    }
    
    public static File[] listDirAllConditionFiles(final File dir, final boolean... conditions) {
        if (dir == null) {
            return null;
        }
        if (!dir.exists() || dir.isFile()) {
            return null;
        }
        return dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(final File file) {
                if (conditions == null || conditions.length == 0) {
                    return true;
                }
                boolean[] val$conditions;
                for (int length = (val$conditions = conditions).length, i = 0; i < length; ++i) {
                    final boolean condition = val$conditions[i];
                    if (!condition) {
                        return false;
                    }
                }
                return true;
            }
        });
    }
    
    public static File[] listDirAllConditionFiles(final String dirPath, final boolean... conditions) {
        if (!exist(dirPath)) {
            return null;
        }
        final File dir = new File(dirPath);
        return dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(final File file) {
                if (conditions == null || conditions.length == 0) {
                    return true;
                }
                boolean[] val$conditions;
                for (int length = (val$conditions = conditions).length, i = 0; i < length; ++i) {
                    final boolean condition = val$conditions[i];
                    if (!condition) {
                        return false;
                    }
                }
                return true;
            }
        });
    }
    
    public static File[] listDirAnyConditionFiles(final File dir, final boolean... conditions) {
        if (dir == null) {
            return null;
        }
        if (!dir.exists() || dir.isFile()) {
            return null;
        }
        return dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(final File file) {
                if (conditions == null || conditions.length == 0) {
                    return true;
                }
                boolean[] val$conditions;
                for (int length = (val$conditions = conditions).length, i = 0; i < length; ++i) {
                    final boolean condition = val$conditions[i];
                    if (condition) {
                        return true;
                    }
                }
                return false;
            }
        });
    }
    
    public static File[] listDirAnyConditionFiles(final String dirPath, final boolean... conditions) {
        if (!exist(dirPath)) {
            return null;
        }
        final File dir = new File(dirPath);
        return dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(final File file) {
                if (conditions == null || conditions.length == 0) {
                    return true;
                }
                boolean[] val$conditions;
                for (int length = (val$conditions = conditions).length, i = 0; i < length; ++i) {
                    final boolean condition = val$conditions[i];
                    if (condition) {
                        return true;
                    }
                }
                return false;
            }
        });
    }
    
    public static File file(final String filename) {
        if (filename == null) {
            return null;
        }
        return new File(filename);
    }
    
    public static File file(final File parent, final String child) {
        if (child == null) {
            return null;
        }
        return new File(parent, child);
    }
    
    public static boolean createFile(final String path) throws IOException {
        return createFile(path, false);
    }
    
    public static boolean createFile(final String path, final boolean override) throws IOException {
        if (path == null) {
            return false;
        }
        final File file = new File(path);
        if (file.exists() && !override) {
            return false;
        }
        if (file.isDirectory()) {
            return file.mkdirs();
        }
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }
        return file.createNewFile();
    }
    
    public static boolean createDir(final String path, final boolean override) {
        if (path == null) {
            return false;
        }
        final File file = new File(path);
        return (!file.exists() || override) && file.mkdirs();
    }
    
    public static boolean createDir(final String path) {
        return createDir(path, false);
    }
    
    public static boolean createParentDir(final String path) {
        return createParentDir(path, false);
    }
    
    public static boolean createParentDir(final File file) {
        return createParentDir(file, false);
    }
    
    public static boolean createParentDir(final String path, final boolean override) {
        return path != null && createDir(new File(path).getParent(), override);
    }
    
    public static boolean createParentDir(final File file, final boolean override) {
        return file != null && createDir(file.getParent(), override);
    }
    
    public static boolean delete(final File file) {
        return file != null && file.delete();
    }
}
