import java.util.Scanner;

public class ArrayPrct_Addition {

    public static void main(String[] args) {

        int [] a = new int[5]; int sum = 0;
        System.out.println("Enter the elements in an Array: ");
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Elements in the Array are: ");

        for(int j = 0; j<a.length; j++){
            System.out.print(a[j]+ " ");
            sum = sum + a[j];

        }

        System.out.println("\nSum of the elements in Array is: "+sum);

    }
}
