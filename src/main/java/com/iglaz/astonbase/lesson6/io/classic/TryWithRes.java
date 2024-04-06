package com.iglaz.astonbase.lesson6.io.classic;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TryWithRes {
    public static void main(String[] args) throws IOException {
        Path file2 = Paths.get("resources", "text.txt");

        try (BufferedReader resources = Files.newBufferedReader(Paths.get("resources", "text.txt"))) {
            System.out.println(resources.readLine());
        }
    }
}
