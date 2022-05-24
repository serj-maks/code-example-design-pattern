package edu.patterns.strategy.after;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyArray array = new MyArray(10);

        Random random = new Random();
        for (int i = 0; i < array.length(); i++) {
            array.set(i, random.nextInt(100));
        }

        System.out.println(array);

        // default sort
        array.sort();
        System.out.println(array);

        array.setSortStrategy(new SelectionSortStrategy());
        array.sort();
        System.out.println(array);
    }
}
