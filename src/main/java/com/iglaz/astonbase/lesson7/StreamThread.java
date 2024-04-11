package com.iglaz.astonbase.lesson7;

import java.util.stream.LongStream;

public class StreamThread {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        long sum = LongStream.generate(() -> 1)
                .parallel()
                .limit(1_000_000_000)
                .sum();

        long finish = System.currentTimeMillis();

        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println(finish - start);
    }
}
