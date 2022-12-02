package training.algorithms;

import java.util.Comparator;

public class BubbleSort implements Sorter {
    @Override
    public <T extends Comparable<T>> void sort(T[] array) {

        if (array!=null && array.length>1){
            for (int i=array.length-1;i>0;i--){
                for (int j =0;j<i;j++){
                    if (array[j].compareTo(array[j+1])>=1){
                        T temp = array[j+1];
                        array[j+1]=array[j];
                        array[j]=temp;
                    }
                }
            }
        }
    }

    @Override
    public <T> void sort(T[] array, Comparator<T> comparator) {
           if (array!=null && array.length>1){
               for (int i=array.length-1;i>0;i--){
                   for (int j =0;j<i;j++){
                       if (comparator.compare(array[j],array[j+1])>0){
                           T temp = array[j+1];
                           array[j+1]=array[j];
                           array[j]=temp;
                       }
                   }
               }
           }
    }
}
