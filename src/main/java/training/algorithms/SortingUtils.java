package training.algorithms;

public class SortingUtils {

    public static <T> void swap(T[] array, int j, int i) {
        T temp = array[j];

        array[j] = array[i];
        array[i] = temp;
    }
}
