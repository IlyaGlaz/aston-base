package com.iglaz.astonbase.lesson6.io;

import java.util.Scanner;

public class ScannerRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int s = scanner.nextInt();
            System.out.println(s);
        } else {
            System.out.println("Не число");
        }

        scanner.close();
    }
}
