import java.util.Scanner;

public class Tst01_028_MonthDays {

    //➤ Use switch to return the number of days in a month (handle leap Feb).
    //➤ Purpose: Decision making.

    public static void main(String[] args) {
        int days = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of a month: ");
        String month = sc.nextLine();
        month = month.toLowerCase();
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        System.out.println("Month Entered : " + month);
        System.out.println("Year Entered : " + year);

        switch(month) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
                days = 31;
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                days = 30;
                break;
            case "february":
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("Invalid Input !!");
                System.exit(0);
        }

        System.out.println("The number of days in " + month + " " + year + " : " + days);

    }
}
