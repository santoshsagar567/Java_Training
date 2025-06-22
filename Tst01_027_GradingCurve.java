import java.util.Scanner;

public class Tst01_027_GradingCurve {

    //➤ Convert score (0-100) to letter grade (A+/A/B/C etc).
    //➤ Purpose: Nested conditions.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Score : ");
        int score = sc.nextInt();
        String grade;

        System.out.println("Score Entered :" + score);
        if (score>=95){
            grade = "A+";
        }
        else if ((score<95) && (score>=80)){
            grade = "A";
        }
        else if ((score<80) && (score>=70)){
            grade = "B";
        }
        else if ((score<70) && (score>=60)){
            grade = "C";
        }
        else if ((score<60) && (score>=40)){
            grade = "D";
        }
        else{
            grade = "F";
        }
        System.out.println("Grade Obtained :" + grade);
    }
}
