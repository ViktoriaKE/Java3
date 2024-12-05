package org.example;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Тесты для класса tester.
 */
public class testerTest {

    @Test
    public void testArrayListPerformance() {
        tester testerInstance = new tester(10000); // тест на 10 000 операций
        long startTime = System.currentTimeMillis();
        testerInstance.testArrayList();
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        // Проверяем, что тест выполняется за разумное время (например, меньше 10 секунд)
        assertTrue(duration < 10000, "ArrayList тест должен завершиться менее чем за 10 секунд.");
    }

    @Test
    public void testLinkedListPerformance() {
        tester testerInstance = new tester(10000); // тест на 10 000 операций
        long startTime = System.currentTimeMillis();
        testerInstance.testLinkedList();
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        // Проверяем, что тест выполняется за разумное время (например, меньше 10 секунд)
        assertTrue(duration < 10000, "LinkedList тест должен завершиться менее чем за 10 секунд.");
    }
}
