package training.algorithms;

import java.util.Comparator;

public class QuickSort implements Sorter {

    @Override
    public <T extends Comparable<T>> void sort(T[] array) {
        if (array!=null && array.length>1){
            quickSort2(array,0,array.length-1);
        }
    }

    @Override
    public <T> void sort(T[] array, Comparator<T> comparator) {
        if (array!=null && array.length>1){
            quickSort(array,0,array.length-1,comparator);
        }

    }

    // method to find the partition position
    private <T> int partition(T[] array, int low, int high, Comparator<T> comparator) {

        // choose the rightmost element as pivot
        T pivot = array[high];

        // pointer for greater element
        int i = (low - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (comparator.compare(array[j], pivot) <= 0) {

                // if element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;

                // swapping element at i with element at j
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        // swapt the pivot element with the greater element specified by i
        T temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the position from where partition is done
        return (i + 1);
    }

    private <T> void quickSort(T[] array, int low, int high, Comparator<T> comparator) {
        if (low < high) {

            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition(array, low, high, comparator);

            // recursive call on the left of pivot
            quickSort(array, low, pi - 1, comparator);

            // recursive call on the right of pivot
            quickSort(array, pi + 1, high, comparator);
        }
    }

    // method to find the partition position
    private <T extends Comparable<T>> int partition2(T[] array, int low, int high) {

        // choose the rightmost element as pivot
        T pivot = array[high];

        // pointer for greater element
        int i = (low - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) <= 0) {

                // if element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;

                // swapping element at i with element at j
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        // swapt the pivot element with the greater element specified by i
        T temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the position from where partition is done
        return (i + 1);
    }

    private <T extends Comparable<T>> void quickSort2(T[] array, int low, int high) {
        if (low < high) {

            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition2(array, low, high);

            // recursive call on the left of pivot
            quickSort2(array, low, pi - 1);

            // recursive call on the right of pivot
            quickSort2(array, pi + 1, high);
        }
    }
}
