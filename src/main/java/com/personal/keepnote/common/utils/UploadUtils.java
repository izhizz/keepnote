package com.personal.keepnote.common.utils;

import java.io.File;
import java.util.Properties;

public class UploadUtils {
    /**
     * 判断是否是linux系统
     *
     * @return
     */
    public static boolean isOSLinux() {
        Properties prop = System.getProperties();
        String os = prop.getProperty("os.name");
        System.out.println(os);
        if (os != null && os.toLowerCase().indexOf("linux") > -1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断使用的文件路径
     *
     * @return
     */
    public static String filePath() {
        String path = "D:/keepnote/picture/";
        if (isOSLinux()) {
            path = "/opt/keepnote/picture/";
        }
        return path;
    }

    /**
     * 是否创建文件夹
     */
    public static String isCreateDir() {
        String path = filePath();
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        return path;
    }


}
