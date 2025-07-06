import java.util.Scanner;

public class ArrayPrct_FindNum {

    public static void main(String[] args) {

        int [] a = {14, 43, 38, 62, 57};
        System.out.println("Enter a number to check if its present in the Array: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 0; i<a.length; i++){

            if(a[i] == num){
                System.out.println("Number "+num+" is Present in the Array");
                System.exit(0);
            }

        }
        System.out.println("Number "+num+" is Not Present in the Array");

    }
}
