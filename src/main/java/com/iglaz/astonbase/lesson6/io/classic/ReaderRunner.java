package com.iglaz.astonbase.lesson6.io.classic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class ReaderRunner {
    public static void main(String[] args) throws IOException {
        File file = Paths.get("resources", "text.txt").toFile();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
        }
    }
}
