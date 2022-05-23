package edu.patterns.strategy.before;

import java.util.Random;

/**
 * Алгоритм сортировки зашит в классе MyArray.
 * Необходимо добавить возможность подставлять свой алгоритм, при необходимости.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        MyArray array = new MyArray(10);

        for (int i = 0; i < array.length(); i++) {
            array.set(i, random.nextInt(100));
        }
        System.out.println(array);

        array.sort();
        System.out.println(array);
    }
}
