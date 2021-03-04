package ClassActivities.Sorting;

public interface ISort {


    public void sort (int[] arr);
    default void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
    }
}
