package SortingFile;

public class SelectionSort implements ISort{


    public <E extends Comparable<E>> void sort(E[] array)
    {
        for ( int i=0; i < array.length-1; i++ )
        {
            // Finding minimum of string reference that should go into cell j
            // look through list for element (j or higher) that is first in order
            int min = i;
            for ( int j=i+1; j < array.length; j++ )
                if ( array[j].compareTo( array[min] ) < 0 ) min = j;

            // Swapping reference at j with reference min
            E temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
