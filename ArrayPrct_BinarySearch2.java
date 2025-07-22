import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrct_BinarySearch2 {

    /* Below is the Algorithm designed for Binary Search:
        1. Start
        2. Take input array and Target
        3. Initialise start = 0 and end = (array size -1)
        4. Intialise mid variable
        5. mid = (start+end)/2
        6. if array[ mid ] == target then return mid
        7. if array[ mid ] < target then start = mid+1
        8. if array[ mid ] > target then end = mid-1
        9. if start<=end then goto step 5
        10. return -1 as target not found
        11. Exit 
    */
    public static int binarySearch(int a[], int start, int end, int x){

        while (start <= end) {
            int mid = (start + end) / 2;

            // Index of Element Returned
            if (a[mid] == x) {
                return mid;
            } else if (a[mid] > x) {
                end = mid - 1;

                // Else the element can only be present
                // in right subarray
                // so we increase our l pointer to mid + 1
            } else {
                start = mid + 1;
            }
        }
    // No Element Found
        return -1;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 60, 70, 50, 30, 80, 40};

        Arrays.sort(arr);
        int len = arr.length;
        System.out.println("Entered array: " + Arrays.toString(arr)); //Array to String

        System.out.println("Enter a value to Search :");
        int num = sc.nextInt();

        int res = binarySearch(arr, 0, len - 1, num);

        if (res == -1) {
            System.out.println(num + " is not found in the array");
        }
        else {
            System.out.println(num + " is present in the array");
            System.out.println("Element found at position : " + res);
        }

    }
}

