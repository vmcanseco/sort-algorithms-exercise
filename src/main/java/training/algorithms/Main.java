package training.algorithms;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        Transaction[] transactions =new Transaction[10];
        bubbleSort.sort(transactions);

        Phone[] phones = new Phone[10];
        Comparator<Phone> compId = (p1,p2)->p1.id.compareTo(p2.id);
        Comparator<Phone> compName = (p1,p2)-> p1.name.compareTo(p2.name);
        bubbleSort.sort(phones,compId);
        bubbleSort.sort(phones,compName);
    }
}
