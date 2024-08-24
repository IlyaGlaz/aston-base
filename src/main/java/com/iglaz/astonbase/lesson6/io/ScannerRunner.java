package com.iglaz.astonbase.lesson6.io;

import java.util.Scanner;

public class ScannerRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        System.out.println(s);

        scanner.close();
    }
}
