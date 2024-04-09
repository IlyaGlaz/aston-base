package com.iglaz.astonbase.lesson6.io.classic;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;

public class WriterRunner {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "text2.txt");

        System.out.println();

        try (BufferedWriter fileWriter = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
            fileWriter.append("Hello World!");
            fileWriter.newLine();
            fileWriter.append("Java");
        }
    }
}
