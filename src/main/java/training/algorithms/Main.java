package training.algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Sorter sorter = new QuickSort();
        //Transaction[] transactions =new Transaction[10];
        //bubbleSort.sort(transactions);

        //Phone[] phones = new Phone[10];
        //Comparator<Phone> compId = (p1,p2)->p1.id.compareTo(p2.id);
        //Comparator<Phone> compName = (p1,p2)-> p1.name.compareTo(p2.name);
        Integer[] array = new Integer[]{9,8,7,6,5,4,3,2,1};
        Comparator<Integer> comparator = (p1,p2)-> p1.compareTo(p2);
        System.out.println("**** Comparator - Before Sorting ***");
        System.out.println(Arrays.asList(array));
        sorter.sort(array,comparator);
        System.out.println("**** Comparator - After Sorting ***");
        System.out.println(Arrays.asList(array));
        array = new Integer[]{9,8,};
        System.out.println("**** Comparable - Before Sorting ***");
        System.out.println(Arrays.asList(array));
        sorter.sort(array);
        System.out.println("**** Comparable - After Sorting ***");
        System.out.println(Arrays.asList(array));
        //bubbleSort.sort(phones,compName);
    }
}
