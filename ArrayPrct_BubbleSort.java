import java.util.Arrays;

public class ArrayPrct_BubbleSort {

    /* Algorithm for Bubble Sort in Java
        1. Start
        2. Initiate two values n as size of array ,also i and j to traverse array.
        3. Put i=0 and j=1.
        4. While traversing if array[i] > array[j] swap both the numbers.
        5. Increment the value i and j then goto Step 3.
        6. If the value of i > n-1 and j > n and n>1 then
        7. n=n-1
        8. goto Step 2
        9. Exit
   */

    public static void main(String[] args) {

        int[] arr = {10, 20, 60, 70, 50, 30, 25, 80, 40};

        System.out.println("Entered array: " + Arrays.toString(arr)); //Array to String
        int n = arr.length; //size of array

        for(int i=0; i < n-1; i++){
            for(int j =0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // swap temp and arr[i]
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }
}

