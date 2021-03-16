package ClassActivities.Sorting;

import ClassActivities.Sorting.ISort;

public class QuickIntSort implements ISort {

    @Override
    public void sort(int arr[])
    {
        quicksort(arr, 0, arr.length-1);
    }

    private void quicksort(int[] arr, int low, int high){
        if(high <= low) return;

        //Get our pivot from the mid element
        int pivot =  arr[(low+high)/2];
        int left = low;
        int right = high;

        while(left <= right){
            //Check until all values on the left are lower than pivot
            while(arr[left] < pivot){
                ++left;
            }
            //Check until all values on the right are greater than pivot
            while (arr[right] > pivot){
                --right;
            }
            //Compare values from both sides to check if they need swap
            if(left <= right){
                swap(arr, left, right);
                //After swapping move the iterator on both arrays
                ++left;
                --right;
            }
        }
        quicksort(arr, low,right);
        quicksort(arr, left,high);
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b] = temp;
    }
}
