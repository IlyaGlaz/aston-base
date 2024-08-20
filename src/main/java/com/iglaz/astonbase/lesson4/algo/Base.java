package com.iglaz.astonbase.lesson4.algo;

public class Base {
    public static void main(String[] args) {

    }

    static int findElem(int[] nums, int target) {
        for (int current : nums) {
            if (current == target) {
                return target;
            }
        }

        return -1;
    }
}
