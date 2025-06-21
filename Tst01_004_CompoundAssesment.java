import java.util.Scanner;

public class Tst01_004_CompoundAssesment {

    public static void main(String[] args){

        //Evaluate an expression like a *= b + 3;

        //int num1, num2;
        System.out.println("Enter 2 Numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The 2 Numbers entered are: "+a+" and "+b);

        a *= b + 3;
        // a:2, b:4 ; Output: 7*2=14
        //a: 7, b:5 : Output: 8*7=56
        System.out.println("Output: "+a);
        //14 and 56

    }
}
