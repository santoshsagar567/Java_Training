import java.util.Scanner;

public class Tst01_001_Arithmetic_Basic {

    //Write a program to accept two numbers and print their sum, difference, product, division, and remainder.

    public static void main(String[] args){

        //int num1, num2;
        System.out.println("Enter 2 Numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("The 2 Numbers entered are: "+num1+" and "+num2);
        System.out.println("Sum of the 2 Numbers: "+(num1+num2));
        System.out.println("Difference of the 2 Numbers: "+(num1-num2));
        System.out.println("Product of the 2 Numbers: "+num1*num2);
        System.out.println("Division of the 2 Numbers: "+num1/num2);
        System.out.println("Remainder of the 2 Numbers: "+num1%num2);

    }

}
