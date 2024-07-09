package com.iglaz.astonbase.lesson6.io;

import java.util.Scanner;

public class ScannerRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
        }

        System.out.println("Other" + i) ;

        scanner.close();
    }
}
