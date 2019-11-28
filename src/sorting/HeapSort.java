package sorting;


/**
 *
 * Description: Heapsort works by first arranging the elements in a max heap structure. Once the
 * elements are in a heap structure, Heapsort works by swapping top and bottom element, logically removing
 * the max element from the heap, the "heapifying" the min element that was moved to the top. Heapsort is a
 * comparison based sorting algorithm.
 *
 * Applications:
 * 1. Sorting a nearly sorted array, or a k-sorted array.
 * 2. Finding the k largest (or smallest) elements of an array.
 *
 *
 *
 * Time Complexity: O(nlogn)
 * Space Complexity: O(n)
 *
 */
public class HeapSort {

    public static void main(String[] args){
        System.out.println("Heap Sort");

        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Original array");
        SortHelper.printArray(arr);

        heapSort(arr);

        System.out.println("Sorted array");
        SortHelper.printArray(arr);


    }

    public static void heapSort(int[] arr){

        //first heapify the array contents
        for(int i = arr.length / 2 - 1; i >= 0; i--){
            heapify(arr, i, arr.length - 1);
        }

        //now that I have a heap, I can repeatedly take out the
        //max item from the heap, and heapify starting from the root node
        for(int i = arr.length - 1; i > 0; i--){
            SortHelper.swap(arr, 0, i);
            heapify(arr, 0, i - 1);
        }

    }

    //check i and i's children, max of all three needs to be at root
    //it is possible here that the right node is null
    public static void heapify(int[] arr, int i, int end){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIndex = i;
        if(left <= end){
            maxIndex = arr[left] > arr[maxIndex] ? left : i;
        }
        if(right <= end){
            maxIndex = arr[right] > arr[maxIndex] ? right : maxIndex;
        }
        if(maxIndex != i){
            SortHelper.swap(arr, maxIndex, i);
            heapify(arr, maxIndex, end);
        }

    }

}
