import java.util.Scanner;

public class ArrayPrct_ReverseAnArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int len = 5; // Length of the Array
        int [] arr = new int[len];

        System.out.printf("Enter %d numbers to be stored in an Array : \n",len);
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array: " + java.util.Arrays.toString(arr)); //Array to String

        for (int k = 0; k < len / 2; k++) {
            int temp = arr[k];
            arr[k] = arr[len - k - 1];
            arr[len - k - 1] = temp;
        }

        System.out.println("\nReversed array: " + java.util.Arrays.toString(arr));


    }
}

