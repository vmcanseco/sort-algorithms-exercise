package training.algorithms;

import java.util.Comparator;

public class InsertionSort implements Sorter{
    @Override
    public <T extends Comparable<T>> void sort(T[] array) {
        if (array!=null && array.length>1){
            for (int pos =1;pos<array.length;pos++){
                T tempValue  = array[pos];
                int prevPos = pos-1;
                while (prevPos>=0){
                    if (array[prevPos].compareTo(tempValue)>0){
                        array[prevPos+1]=array[prevPos];
                        prevPos--;
                    }else{
                        break;
                    }
                }
                array[prevPos+1]=tempValue;
            }
        }
    }

    @Override
    public <T> void sort(T[] array, Comparator<T> comparator) {
        if (array!=null && array.length>1){
            for (int pos =1;pos<array.length;pos++){
                T tempValue  = array[pos];
                int prevPos = pos-1;
                while (prevPos>=0){
                    if (comparator.compare(tempValue,array[prevPos])<0){
                        array[prevPos+1]=array[prevPos];
                        prevPos--;
                    }else{
                        break;
                    }
                }
                array[prevPos+1]=tempValue;
            }
        }
    }
}
