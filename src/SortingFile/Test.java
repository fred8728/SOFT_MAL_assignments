package SortingFile;

public class Test {

    public static void main(String[] args) throws Exception {

        FileUtility fileUtility = new FileUtility();
        String king[] = fileUtility.toStringArray("data/king-james-bible.txt", "[^A-Za-z']+" );
        String shakespeare[] = fileUtility.toStringArray("data/many-sorted-numbers.txt", "[^A-Za-z']+" ); //file is to big to use
        String test[] = fileUtility.toStringArray("data/test", "[^A-Za-z']+");

        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        HeapSort heapSort = new HeapSort();
        Integer numbers[] = {12,4,55,12,14,66};

        try(Stopwatch sw = new Stopwatch()){
            //SelectionSort - shakespeare - More than 3 minutes
            selectionSort.sort(test);

            //InsertionSort - shakespeare - More than 3 minutes
            //insertionSort.sort(king);

            //MergeSort - king-james-bible - 495,799700
            //mergeSort.sort(king, 0, king.length-1);

            //HeapSort - king-james-bible - 1110,375800
            //heapSort.sort(king);

            //Sorting with trie - king-james-bible -

            //Testing if heap can sort array of type Integer
            heapSort.sort(numbers);
        }
        for (int i = 0; i <test.length; ++i)
            System.out.print(test[i] + " ");
    }
}

