package com.iglaz.astonbase.lesson6.io.classic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class NewIOApi {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "text.txt");

        List<String> strings = Files.readAllLines(path);

        Files.lines(path).forEach(System.out::println);

//        System.out.println(strings);
    }
}
