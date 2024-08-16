package com.iglaz.astonbase.lesson7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class FileLoadingDemo {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        try (Stream<Path> files = Files.list(Path.of("resources"))) {
            ExecutorService executorService = Executors.newFixedThreadPool(10);

            files.forEach(path -> executorService.submit(() -> inputAndOutput(path)));

        } catch (IOException ex) {
            System.out.println(ex);
        }

        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime);
    }

    private static void inputAndOutput(Path path) {
        var builder = new StringBuilder();
        try {
            builder.append(Files.readString(path)).reverse();
            Files.writeString(Path.of("resources", "copy" + path.getFileName()), builder);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}