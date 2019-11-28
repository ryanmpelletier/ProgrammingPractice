package sorting;

/**
 *
 * Description: Mergesort works by repeatedly subdividing the original array into single elements, then building sorted lists
 * and merging the sorted lists together.
 *
 *
 * Pros:
 * 1. Great for sorting data that can't fit all into memory.
 * 2. Good for sorting something like LinkedLists. Inserts are O(1). (can be done in plae with LinkedLists)
 *
 * Cons: Requires extra space.
 *
 *
 * Time Complexity: O(nlogn)
 * Space Complexity: O(n)
 *
 */
public class MergeSort {

    public static void main(String[] args){
        System.out.println("Merge Sort");

        int[] arr = {4, 3, 2, 1};

        System.out.println("Original array");
        SortHelper.printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array");
        SortHelper.printArray(arr);


    }

    static void mergeSort(int[] arr, int l, int r){
        if(l < r){
            int m = l + (r - l) / 2;
            System.out.println("l=" + l + ", m=" + m + ", r=" + r);
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            sort(arr, l, m, r);
        }

    }

    static void sort(int[] arr, int l, int m, int r){

        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        //allocate new arrays
        int L[] = new int [n1];
        int R[] = new int [n2];

        //copy unsorted parts of array to temporary arrays
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }

        System.out.println("Sorting left array of size=" + n1 + ", right array of size=" + n2);


    }

}
