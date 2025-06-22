import java.util.Scanner;

public class Tst01_024_BMICalculator {

    //➤ Given height & weight, return BMI category.
    //➤ Purpose: Math + if-else decision making.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in Kgs : ");
        float wt = sc.nextFloat();
        System.out.println("Enter your height in meters : ");
        float ht = sc.nextFloat();

        float bmiIndex = wt / (ht * ht);
        System.out.println("Entered weight in Kgs : " + wt);
        System.out.println("Entered height in meters : " + ht);
        System.out.println("Your BMI Index : " + bmiIndex);
        if (bmiIndex >= 30) {
            System.out.println("You are Obese");
        } else if ((bmiIndex < 30) && (bmiIndex >= 25)) {
            System.out.println("You are Overweight");
        } else if ((bmiIndex < 25) && (bmiIndex >= 18.5)) {
            System.out.println("You have Normal weight");
        } else {
            System.out.println("You are Underweight");
        }
    }
}
