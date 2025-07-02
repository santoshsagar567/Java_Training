import java.util.Scanner;

public class NumPrct_012_Print_NextPrime {

    public static boolean checkPrime(int number){
        int count =0;
        boolean check_prime;
        for (int i = 1;i<=number;i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count==2){
            check_prime = true;
        }
        else {
            check_prime = false;
        }
        return check_prime;
    }

    public static void main (String[] args){

        System.out.println("Enter a Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Prime Numbers (up to 20) after the number "+num+" are :");
        //int j = num+1;
        for (int j= num+1; j<=20; j++){
            if (checkPrime(j)){
                System.out.print(j+" ");
                //break; --> to print only next 1 prime number
            }

        }


    }
}
