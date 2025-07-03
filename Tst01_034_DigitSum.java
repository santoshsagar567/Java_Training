import java.util.Scanner;

public class Tst01_034_DigitSum {

    //Digit Sum
    //➤ Keep summing digits until one digit remains (987 → 9+8+7=24 → 2+4=6).
    //➤ Purpose: Loop and math logic.

    public static int countDigit(int number){
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

    public static void main(String[] args) {

        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        int digitcount = countDigit(num);
        for (int i = digitcount; i >1; i--){
            while(n!=0){
                int rem1=n%10;
                sum = sum+rem1;
                n = n/10;
            }
            n = sum;
            sum = 0;
        }
        System.out.println("Output : "+n);

    }
}
