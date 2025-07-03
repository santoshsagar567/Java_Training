import java.util.Scanner;

public class Tst01_033_FibonacciSeries {

    //Fibonacci Up to N
    //➤ Print all Fibonacci numbers less than or equal to N.
    //➤ Purpose: Loop logic.

    public static void main(String[] args) {

        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Fibonacci Series upto the Number "+num+" is as follows:");
        int n1 = 0, n2 = 1;

        for (int i = 0; i < num; i++) {
            // Print the number
            System.out.print(n1 + " ");

            // Swap
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;

            if(n1>num){
                break;
            }
        }

    }
}
