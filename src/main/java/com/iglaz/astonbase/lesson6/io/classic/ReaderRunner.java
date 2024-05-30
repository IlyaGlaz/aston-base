package com.iglaz.astonbase.lesson6.io.classic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReaderRunner {
    public static void main(String[] args) throws IOException {
        File file = Paths.get("resources", "text.txt").toFile();

//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
//            String s;
//            while ((s = bufferedReader.readLine()) != null) {
//                System.out.println(s);
//            }
//        }

//        Files.lines(Paths.get("resources", "text.txt"))
//                .forEach(System.out::println);
//
//        Files.write()

        Scanner input = new Scanner(System.in);

        if (input.hasNextInt()) {
            System.out.println(input.nextInt());
        }

        input.close();
    }
}
