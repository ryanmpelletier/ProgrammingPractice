package sorting;


/**
 *
 * Description: Quicksort works by selecting a single item called a "pivot" point and putting that item
 * in its proper position in the array. It then divides the remaining unsorted elements on either side
 * of the pivot and calls itself recursively on the 2 unsorted lists.
 *
 * Pros:
 * 1. Can be implemented quickly on most architectures.
 * 2. Doesn't use extra space.
 *
 *
 * Cons: Can perform really bad for something mostly sorted if the pivot choices are bad.
 *
 *
 * Time Complexity:
 * Best: O(nlogn)
 * Worst: O(n^2)
 * Average: O(nlogn)
 *
 * Space Complexity: O(1)
 *
 * In Place: Yes
 * Stable: No
 *
 */
public class QuickSort {

    public static void main(String[] args){
        System.out.println("Quick Sort");

        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Original array");
        SortHelper.printArray(arr);

        quickSort(arr);


        System.out.println("Sorted array");
        SortHelper.printArray(arr);


    }


    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int l, int r){
        int end = r;
        if(l < r){

            int i = r - 1;
            while(i >= l){

                if(arr[i] > arr[r]){
                    SortHelper.swap(arr, i, r);
                    r = i;
                }
                i--;
            }
            quickSort(arr, l, r - 1);
            quickSort(arr, r + 1, end);
        }


    }


}
