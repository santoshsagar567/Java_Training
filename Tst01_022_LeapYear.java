import java.util.Scanner;

public class Tst01_022_LeapYear {

    //➤ Check if a year is leap (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)).
    //➤ Purpose: Conditionals.

    public static void main(String[] args) {

        System.out.println("Enter the year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Entered Year is a Leap Year !!");
        } else {
            System.out.println("Entered Year is Not a Leap Year !!");
        }

    }
}
