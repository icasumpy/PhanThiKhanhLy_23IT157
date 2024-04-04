package baitapjava;

import java.io.File;

public class FileUtils {
    public static void listFilesRecursively(File directory) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        listFilesRecursively(file);
                    } else {
                        System.out.println(file.getAbsolutePath());
                    }
                }
            }
        }
    }
}
