package com.iglaz.astonbase.lesson6.io.classic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Homework {
    public static void main(String[] args) {
        Path path = Path.of("resources",  "text.txt");

        //allWordBeginOnVowelLetter(path); //ex1
        //equalsLastAndNextFirstLetter(path); //ex2
        maxLengthNumberInLine();
        //replacingPublicWithPrivate(); //ex4
        //reverseJavaFile(); //ex5


    }

    //Exercise 1
    public static void allWordBeginOnVowelLetter(Path path) {
        try {
            Files.lines(path)
                    .map(x -> x.split("\\s+"))
                    .flatMap(Arrays::stream)
                    .filter(x -> x.matches("[ауоыэяюёиеАУОЫЭЯЮЁИЕ].*"))
                    .map(s -> s.replaceAll("\\p{Punct}", ""))
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Exercise 2
    public static void equalsLastAndNextFirstLetter(Path path) {
        List<String> words;

        try {
            words = Files.lines(path)
                    .map(x -> x.split("\\s+"))
                    .flatMap(Arrays::stream)
                    .map(s -> s.replaceAll("\\p{Punct}", ""))
                    .toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String current;
        String next;

        for (int i = 0; i < words.size() - 1; i++) {
            current = words.get(i);
            next = words.get(i + 1);

            if (current.endsWith(String.valueOf(next.charAt(0)).toLowerCase())) {
                System.out.println(current);
            }
        }
    }

    //Exercise 3
    public static void maxLengthNumberInLine() {
        Path path = Path.of("resources/numbers.txt");

        try {
            Files.lines(path)
                    .map(x -> x.replaceAll("\\D+", " "))
                    .map(String::trim)
                    .map(x -> x.split("\\s+"))
                    .map(x -> Arrays.stream(x)
                            .map(String::length)
                            .max(Integer::compare)
                    )
                    .map(Optional::get)
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    //Exercise 4
    public static void replacingPublicWithPrivate() {
        Path savePath = Path.of("resources/Person.java");
        Path targetPath = Path.of("src/main/java/com/iglaz/astonbase/lesson6/io/serialization/Person.java");

        try(BufferedWriter bw = Files.newBufferedWriter(savePath)) {
            String collect = Files.lines(targetPath)
                    .map(x -> x.replaceAll("\\bpublic\\b(?!\\s+\\bclass\\b)", "private "))
                    .collect(Collectors.joining("\n"));

            bw.write(collect);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Exercise 5
    public static void reverseJavaFile() {
        Path savePath = Path.of("resources/Reverse.java");
        Path targetPath = Path.of("src/main/java/com/iglaz/astonbase/lesson6/io/serialization/Person.java");

        StringBuilder builder = new StringBuilder();
        try (BufferedWriter bw = Files.newBufferedWriter(savePath)){
            String result =  Files.lines(targetPath)
                    .map(x -> {
                        builder.append(x);
                        builder.reverse();
                        String temp = builder.toString();
                        builder.delete(0, builder.length());
                        return temp;
                    })
                    .collect(Collectors.joining("\n"));

            bw.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}