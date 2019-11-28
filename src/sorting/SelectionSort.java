package sorting;

/**
 *
 * Description: Simple sorting algorithm that works from left to right, repeatedly finding the nex min element
 * and swapping it with the item it is currently iterating on.
 *
 *
 * Pros: Never makes more than O(n) swaps, can be useful when memory write is costly.
 *
 *
 * Cons: Not super fast. Bad asymptotic runtime.
 *
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 *
 */
public class SelectionSort {

    public static void main(String[] args){
        System.out.println("Selection Sort");

        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Original array");
        SortHelper.printArray(arr);

        for(int i = 0; i < arr.length; i++){
            int min = Integer.MAX_VALUE;
            int swapIndex = i;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    swapIndex = j;
                }
            }
            SortHelper.swap(arr, i, swapIndex);
        }
        System.out.println("Sorted array");
        SortHelper.printArray(arr);


    }
}
