package com.iglaz.astonbase.lesson4.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenListTest {

    @Test
    void ifAddSizeMore() {
        // Дано
        GenList<String> stringGenList = new GenList<>(22);

        // Вызов тестового метода
        stringGenList.add("str");

        // Проверка результата
        assertEquals(stringGenList.getSize(), 1);
        assertEquals("str", stringGenList.get(0));
    }
}