package SortingFile;

import java.util.Arrays;

public class MergeSort {

    public <E extends Comparable<E>> void sort(E[] array, int left, int right)
    {
        if (left < right) {
            // Find the middle point
            int mid = left+ (right-left)/2;

            // Sort first and second halves
            sort(array, left, mid);
            sort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    public <E extends Comparable<E>> void merge(E arr[], int left, int mid, int right)
    {
        // Find size of two subarrays
        int l = mid - left + 1;
        int r = right - mid;

        // Temp arrays
        E leftArr[] = newArray(l);
        E rightArr[] = newArray(r);

        /*Copy data to temp arrays*/
        for (int i = 0; i < l; ++i)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < r; ++j)
            rightArr[j] = arr[mid + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = left;
        while (i < l && j < r) {
            if (leftArr[i].compareTo(rightArr[j])<= 0)
            {
                arr[k] = leftArr[i];
                i++;
            }
            else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < l) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < r) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    @SafeVarargs
    static <E> E[] newArray(int length, E... array)
    {
        return Arrays.copyOf(array, length);
    }
}


