package Sorting;

import java.io.IOException;

public class SelectionSort implements ISorting {

    @Override
    public String[] sort( String array[])
    {
        for ( int i=0; i < array.length-1; i++ )
        {
            // Finding minimum of string reference that should go into cell j
            // look through list for element (j or higher) that is first in order
            int min = i;
            for ( int j=i+1; j < array.length; j++ )
                if ( array[j].compareToIgnoreCase( array[min] ) < 0 ) min = j;

            // Swapping reference at j with reference min
            String temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }

    public static void main(String[] args) throws Exception {
        FileUtility fileUtility = new FileUtility();
        SelectionSort selectionSort = new SelectionSort();
        String arr[] = fileUtility.toStringArray("data/king-james-bible.txt", "[^A-Za-z']+" );
        String test[] = {"Frederik", "Kirsten", "Simone", "Frederikke","Hanne", "Carla", "Hey", "Yo", "Webcam"};
        String[] result;
        try(Stopwatch sw = new Stopwatch()){
            result = selectionSort.sort(test);
        }
        selectionSort.printArray(result);
    }
}
