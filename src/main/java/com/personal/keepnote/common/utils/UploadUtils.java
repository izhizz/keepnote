package com.personal.keepnote.common.utils;

import java.io.File;
import java.util.Properties;

public class UploadUtils {
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

    public static boolean isDir(String path) {
        boolean flag = false;
        File file = new File("d:\\test_file.txt");
        if (file.exists()) {
            if (file.isDirectory()) {
                flag = true;
            } else {
                System.out.println("the same name file exists, can not create dir");
            }
        } else {
            System.out.println("dir not exists, create it ...");
            file.mkdir();
        }

        return flag;

    }


}
