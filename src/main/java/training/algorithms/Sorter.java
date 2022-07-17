package training.algorithms;

import java.util.Comparator;

public interface Sorter {

    <T extends Comparable<T>> void sort(T[] array);

    <T> void sort(T[] array, Comparator<T> comparator);
}
