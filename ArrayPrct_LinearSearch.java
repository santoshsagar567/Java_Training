import java.util.Scanner;

public class ArrayPrct_LinearSearch {

    /* Algorithm for Linear Search
        Start
        Declare an array and search element as the key.
        Traverse the array until the number is found.
        If the key element is found, return the index position of the array element
        If the key element is not found, return -1
        Stop.
     */

    public static boolean linearSearchArray(int x, int y){

        if (x==y){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Entered array: " + java.util.Arrays.toString(arr)); //Array to String

        System.out.println("Enter a value to Search :");
        int num = sc.nextInt();

        boolean res = false;
        for (int i = 0; i < arr.length; i++) {

            res = linearSearchArray(arr[i], num);
            if (res) {
                System.out.println(num + " is present in the array");
                System.out.println("Element found at position : "+i);
                break;
            }
        }

        if(!res){
            System.out.println(num + " is not found in the array");
        }

    }
}

