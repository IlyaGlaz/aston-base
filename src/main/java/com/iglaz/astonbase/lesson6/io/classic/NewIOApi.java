package com.iglaz.astonbase.lesson6.io.classic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class NewIOApi {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "text.txt");

//        System.out.println(Files.readString(path));

        try (Stream<String> lines1 = Files.lines(path)) {
            lines1.map(str -> str.length()).forEach(System.out::println);
        }
//
//        try (Stream<String> lines = Files.lines(path)) {
//            lines.filter(str -> str.length() > 10);
//        }

//        System.out.println(strings);
    }
}
