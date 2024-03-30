package com.iglaz.astonbase.lesson6.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileRunner {
    public static void main(String[] args) throws IOException {
        File file = new File("resource/text.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
        System.out.println(file.setExecutable(true));

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());

        File dir = new File("resource/test/text");
        System.out.println(dir.mkdirs());

        BufferedInputStream str = new BufferedInputStream(new FileInputStream(new File("str")));
    }
}
