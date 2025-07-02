import java.util.Scanner;

public class NumPrct_010_Armstrong_Number {
    /* An Armstrong number, also known as a narcissistic number, is a number that is the sum of its own digits
    // each raised to the power of the number of digits in the number.
    // For example, 153 is an Armstrong number because 153 = 1³ + 5³ + 3³ = 1 + 125 + 27 = 153. */

    public static int countDigits(int number){
        if(number == 0){
            return 1;
        }
        int count = 0;
        if(number < 0){
            number = -number;
        }
        while(number > 0){
            number = number/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        //int
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num; int res = 0;
        int digitcount = countDigits(num);
        while(num!=0){
            int rem = num%10;
            res =  res + (int) Math.pow(rem,digitcount);
            num = num/10;
        }
        if (res == n){
            System.out.println("It is an Armstrong Number");
        }
        else {
            System.out.println("It is Not an Armstrong Number");
        }

    }
}
