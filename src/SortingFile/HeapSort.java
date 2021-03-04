package SortingFile;

public class HeapSort implements ISort {

    @Override
    public <E extends Comparable<E>> void sort(E[] arr) {
        int size = arr.length;

        // Build heap (rearrange array)
        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(arr, size, i);

        // One by one extract an element from heap
        for (int i = size - 1; i > 0; i--) {
            // Move current root to end
            E temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    //size is the size of heap
    public <E extends Comparable<E>> void heapify(E arr[], int size, int node)
    {
        int largest = node; // Initialize largest as root
        int leftChild = 2 * node + 1; // leftchild(x) = 2 * x + 1
        int rightChild = 2 * node + 2; // rightchild(X) = 2 * x + 2

        // If left child is larger than root
        if (leftChild < size && arr[leftChild].compareTo(arr[largest]) <= 0 )
            largest = leftChild;

        // If right child is larger than root
        if (rightChild < size && arr[rightChild].compareTo(arr[largest]) <= 0)
            largest = rightChild;

        // If largest is not root
        if (largest != node) {
            E swap = arr[node];
            arr[node] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, size, largest);
        }
    }
}
