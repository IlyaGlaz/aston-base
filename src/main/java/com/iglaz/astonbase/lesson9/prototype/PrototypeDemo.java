package com.iglaz.astonbase.lesson9.prototype;

import java.util.List;

public class PrototypeDemo {
    public static void main(String[] args) {
        ComplexThing prototypeThing = new ComplexThing(22, 22, 44);

        List<ComplexThing> workingThings = List.of(
                prototypeThing.copy(77),
                prototypeThing.copy(52222),
                prototypeThing.copy(72),
                prototypeThing.copy(666),
                prototypeThing.copy(1234)
        );

        System.out.println(workingThings);
    }
}
