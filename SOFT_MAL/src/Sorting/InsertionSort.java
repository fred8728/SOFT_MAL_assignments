package Sorting;

import java.io.IOException;

public class InsertionSort implements ISorting{

    @Override
    public String[] sort(String[] array) {

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){

                // move elements of array that are greater than key
                // --> to one position ahead of their current position
                if(array[i].compareToIgnoreCase(array[j])>0){
                    String temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
        }

    public static void main(String[] args) throws Exception {
        FileUtility fileUtility = new FileUtility();
        InsertionSort insertionSort = new InsertionSort();
        String arr[] = fileUtility.toStringArray("data/king-james-bible.txt", "[^A-Za-z']+");
        String test[] = {"Frederik", "Kirsten", "Simone", "Frederikke", "Hanne", "Carla", "Hey", "Yo", "Webcam"};
        String[] result;
        try (Stopwatch sw = new Stopwatch()) {
            result = insertionSort.sort(test);
        }
        insertionSort.printArray(result);
    }
}
