package com.iglaz.astonbase.lesson6.io.classic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class NewIOApi {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "text.txt");

        try (Stream<String> lines = Files.lines(path)) {
            lines.filter(str -> str.length() > 10);
        }

//        System.out.println(strings);
    }
}
