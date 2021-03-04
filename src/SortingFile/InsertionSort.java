package SortingFile;

public class InsertionSort implements ISort {

    public <E extends Comparable<E>> void sort(E[] array) {

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){

                // move elements of array that are greater than key
                // --> to one position ahead of their current position
                if(array[i].compareTo(array[j])>0){
                    E temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
}
