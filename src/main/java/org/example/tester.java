package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Класс для тестирования производительности ArrayList и LinkedList.
 */
public class tester {

    private final int testSize;

    /**
     * Конструктор класса tester.
     *
     * @param testSize Количество операций для тестирования.
     */
    public tester(int testSize) {
        this.testSize = testSize;
    }

    /**
     * Метод для тестирования ArrayList.
     */
    public void testArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        runTests(arrayList, "ArrayList");
    }

    /**
     * Метод для тестирования LinkedList.
     */
    public void testLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        runTests(linkedList, "LinkedList");
    }

    /**
     * Метод для выполнения тестов производительности.
     *
     * @param list    Тестируемый список (ArrayList или LinkedList).
     * @param listType Тип списка для вывода в консоль.
     */
    private void runTests(List<Integer> list, String listType) {
        System.out.println("Testing " + listType + " with " + testSize + " operations.");

        long addTime = measureTime(() -> {
            for (int i = 0; i < testSize; i++) {
                list.add(i);
            }
        });

        long getTime = measureTime(() -> {
            for (int i = 0; i < testSize; i++) {
                list.get(i);
            }
        });

        long removeTime = measureTime(() -> {
            for (int i = testSize - 1; i >= 0; i--) {
                list.remove(i);
            }
        });

        System.out.printf("%-10s | %-10s | %-10s | %-10s%n", "Method", "Operations", "Time (ms)", "List Type");
        System.out.printf("%-10s | %-10d | %-10d | %-10s%n", "Add", testSize, addTime, listType);
        System.out.printf("%-10s | %-10d | %-10d | %-10s%n", "Get", testSize, getTime, listType);
        System.out.printf("%-10s | %-10d | %-10d | %-10s%n", "Remove", testSize, removeTime, listType);
        System.out.println();
    }

    /**
     * Метод для измерения времени выполнения кода.
     *
     * @param runnable Лямбда или анонимный класс для выполнения кода.
     * @return Время выполнения в миллисекундах.
     */
    private long measureTime(Runnable runnable) {
        long startTime = System.currentTimeMillis();
        runnable.run();
        return System.currentTimeMillis() - startTime;
    }
}