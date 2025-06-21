import java.util.Scanner;

public class Tst01_005_TernaryChainGrading {

    //Convert if-else for assigning grades into a chained ternary operator.
    //➤ Purpose: Understanding ternary (?:) logic and chaining.

    public static void main(String[] args) {

        System.out.println("Enter your Grade: ");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        System.out.println("The Grade entered is: " + grade);
        String result = (grade >= 45 ? "Pass" : "Fail");
        System.out.println("Result: " + result);

    }
}


