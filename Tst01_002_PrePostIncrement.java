import java.util.Scanner;

public class Tst01_002_PrePostIncrement {

    // Given a line like int y = ++x + x++ + --x;, calculate the final value and explain why.

    public static void main(String[] args) {

        //int y;
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("The Number entered is: " + x);
        int y = (++x + x++ + --x);
        //1: 2+2+2
        //15: 16+16+16
        System.out.println("Output: " + y);
        //Output should return a value of (Number entered + 1)*3.

    }
}
