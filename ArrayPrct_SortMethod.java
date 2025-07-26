import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrct_SortMethod {

    /* Sort numbers program in Java using in-built method Arrays.sort(). */

    public static void main(String[] args) {

        int[] arr = {10, 20, 60, 70, 50, 30, 80, 40};

        System.out.println("Entered array: " + Arrays.toString(arr)); //Array to String

        Arrays.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));

    }
}

