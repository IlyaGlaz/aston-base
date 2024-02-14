package com.iglaz.astonbase.lesson6.io.classic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;

public class InputStreamRunner {
    public static void main(String[] args) throws IOException {
        File file1 = new File(String.join(File.separator, "resource", "text.txt"));
        File file2 = Paths.get("resources", "text.txt").toFile();
//        Path resources = Path.of("resources", "text.txt");

        try (FileInputStream inputStream = new FileInputStream(file2)) {
//            byte[] bytes = inputStream.readAllBytes();
            byte[] bytes = new byte[inputStream.available()];
            int counter = 0;
            byte currentByte;
            while ((currentByte = (byte) inputStream.read()) != -1) {
//                bytes[counter++] = currentByte;
            }

            String stringValue = new String(bytes);
            System.out.println(stringValue);
        }
    }
}
