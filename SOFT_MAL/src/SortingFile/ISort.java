package SortingFile;

public interface ISort {

    public <E extends Comparable<E>> void sort(E[] array);
    default void printArray(String arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
    }
}
