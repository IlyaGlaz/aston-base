package com.iglaz.astonbase.lesson4;

import com.iglaz.astonbase.lesson3.A.Predator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class Anonimus {
    public static void main(String[] args) {
        class SomeClass {

        }

        SomeClass someClass = new SomeClass();

        Predator predator = new Predator() {
            @Override
            public void hunt() {
                System.out.println("");
            }
        };
    }
}
