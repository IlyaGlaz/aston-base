package com.iglaz.astonbase.lesson6.io.classic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;

public class OutputStreamRunner {
    public static void main(String[] args) throws IOException {
        File file = Paths.get("resources", "text2.txt").toFile();

        System.out.println();

        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            String value = "Hello World4!";
            outputStream.write(value.getBytes());
            outputStream.write(System.lineSeparator().getBytes());
        }
    }
}
