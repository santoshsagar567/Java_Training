import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrct_BinarySearch1 {

    /* Binary Search program in Java using in-build method Arrays.binarysearch(). */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 60, 70, 50, 30, 80, 40};

        Arrays.sort(arr);

        System.out.println("Entered array: " + java.util.Arrays.toString(arr)); //Array to String

        System.out.println("Enter a value to Search :");
        int num = sc.nextInt();

        int res = Arrays.binarySearch(arr, num);

        if (res >= 0) {

            System.out.println(num + " is present in the array");
            System.out.println("Element found at position : " + res);
        }
        else {
            System.out.println(num + " is not found in the array");
        }

    }
}

