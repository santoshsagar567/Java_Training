import java.util.Arrays;

public class ArrayPrct_SelectionSort {

    /* Algorithm for Selection Sort in Java
        Step 1: Array arr with N size
        Step 2: Initialise i=0
        Step 3: If(i<N-1) Check for any element arr[j] where j>i and arr[j]<arr[i] then Swap arr[i] and arr[j]
        Step 4: i=i+1 and Goto Step 3
        Step 5: Exit
   */

    public static void main(String[] args) {

        int[] arr = {10, 20, 60, 70, 50, 30, 25, 80, 40};

        System.out.println("Entered array: " + Arrays.toString(arr)); //Array to String
        int n = arr.length; //size of array

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {

            // Find the minimum element in unsorted array
            int min_idx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));

    }
}

