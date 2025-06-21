import java.util.Scanner;

public class Tst01_003_BitwiseSwapper {

    //Swap two numbers using XOR: a = a ^ b; b = a ^ b; a = a ^ b;

    public static void main(String[] args) {

        //int y;
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("The 2 Numbers entered are X: " + x + " and Y: " + y);
        x = x ^ y; y = x ^ y; x = x ^ y; //Swaping using XOR
        System.out.println("The 2 Numbers after swap are X: " + x + " and Y: " + y);

    }
}
