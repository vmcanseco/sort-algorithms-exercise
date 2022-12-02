package training.algorithms;

import java.util.Comparator;

public class BubbleSort implements Sorter {
    @Override
    public <T extends Comparable<T>> void sort(T[] array) {

        array[1].compareTo(array[0]);
    }

    @Override
    public <T> void sort(T[] array, Comparator<T> comparator) {
            //comparator.compare()
    }
}
