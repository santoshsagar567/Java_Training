import java.util.Scanner;

public class Tst01_021_VoteEligibilty {

    // Use a boolean method to check if someone can vote.
    //➤ Purpose: Basic if + boolean return practice.

    public static boolean checkVoteEligibility(int a) {
        return a >= 18;
    }

    public static void main(String[] args) {

        System.out.println("Enter your Age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (checkVoteEligibility(age)) {
            System.out.println("You are Eligible to Vote !!");
        } else {
            System.out.println("You are Not Eligible to Vote !!");
        }


    }
}
