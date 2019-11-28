package sorting;

/**
 *
 * Description: Works by starting at the beginning of the list with a single item. That item is said to be in order.
 * Gets the next item and puts it in the correct location in the sorted list, and repeats this process, building a sorted
 * list from left to right until finally the entire list is sorted.
 *
 *
 * Pros: Really good if elements are mostly in order
 *
 * Cons: Not that fast, bad runtime. Quicksort, Mergesort, and Heapsort are better.
 *
 *
 * Time Complexity:
 * Best: O(n)
 * Worst: O(n^2)
 *
 * Space Complexity: O(n)
 *
 */
public class InsertionSort {

    public static void main(String[] args){
        System.out.println("Insertion Sort");

        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Original array");
        SortHelper.printArray(arr);

        for(int i = 0; i < arr.length; i++){
            int j = i;
            while(j >= 0 && j < arr.length - 1 && arr[j + 1] < arr[j]){
                SortHelper.swap(arr, j, j + 1);
                j--;
            }

        }


        System.out.println("Sorted array");
        SortHelper.printArray(arr);


    }

}
