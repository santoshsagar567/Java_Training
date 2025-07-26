import java.util.Arrays;

public class ArrayPrct_InsertionSort {

    /* Algorithm for Insertion Sort in Java
        1. Variable declared i=1
        2. Traverse the Array till i<N
        3. If arr[i]<arr[i-1] then arr[j]=value present after shifting the elements of the array from j to i-1.
        4. Return the Sorted Array.
   */

    public static void main(String[] args) {

        int[] arr = {10, 20, 60, 70, 50, 30, 25, 80, 40};

        System.out.println("Entered array: " + Arrays.toString(arr)); //Array to String
        int n = arr.length; //size of array

        for (int i = 1; i < n; ++i) {
            int k = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are
            // greater than key, to one position ahead
            // of their current position
            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = k;
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));

    }
}

