package ClassActivities.Sorting;

import ClassActivities.Sorting.HeapIntSort;

public class Test {
    public static void main(String[] args) {

        System.out.println("_______________________");
        System.out.println("HeapSort");
        System.out.println("_______________________");
        int arr1[] = { 2,1,9,13,6,44,6,2,11,99 };

        HeapIntSort heapSort = new HeapIntSort();
        heapSort.sort(arr1);

        System.out.println("Sorted array: ");
        heapSort.printArray(arr1);
        System.out.println("\n_______________________");

        System.out.println("_______________________");
        System.out.println("QuickSort");
        System.out.println("_______________________");
        int[] arr2 = {1,5,2,9,44,5,2,6,1,6,99,55,88,7,565};
        QuickIntSort qs = new QuickIntSort();
        qs.sort(arr2);

        System.out.println("Sorted array: ");
        qs.printArray(arr2);
        System.out.println("\n_______________________");
    }
}
