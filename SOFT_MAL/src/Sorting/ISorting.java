package Sorting;

public interface ISorting {

    public String[] sort(String arr[]);
    default void printArray(String arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
    }
}
