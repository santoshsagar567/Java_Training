import java.util.Scanner;

public class Tst01_029_MiniCalculator {

    //➤ + - * / % using switch.
    //➤ Purpose: Practical control structure use.

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter your 2nd Number : ");
        int num2 = sc.nextInt();

        System.out.println("The 2 Numbers entered are : "+num1+" and "+num2);
        System.out.println("Press '+' for Addition, '-' for Subtraction, '*' for Multiplication, '/' for Division and '%' for Modulus.");
        System.out.println("Enter your choice: ");
        char ch = sc.next().charAt(0);
        int result = 0;

        switch (ch) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid Input!! ");
        }
        System.out.println("Result: " + result);

    }
}
