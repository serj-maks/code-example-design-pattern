package edu.patterns.strategy.after;

import java.util.Arrays;

public class MyArray {
    private int[] array;
    private SortStrategy sortStrategy;

    public MyArray(int capacity) {
        array = new int[capacity];
        // default sort
        this.sortStrategy = new BubbleSortStrategy();
    }

    public void set(int index, int value) {
        array[index] = value;
    }

    public int length() {
        return array.length;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort() {
        sortStrategy.sort(array);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
