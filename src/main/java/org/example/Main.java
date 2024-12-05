package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Главный класс для запуска тестов производительности ArrayList и LinkedList.
 */
public class Main {

    public static void main(String[] args) {
        tester tester = new tester(100000); // Тестирование на 100000 операций

        // Тестируем ArrayList
        System.out.println("ArrayList:");
        tester.testArrayList();

        // Тестируем LinkedList
        System.out.println("LinkedList:");
        tester.testLinkedList();
    }
}