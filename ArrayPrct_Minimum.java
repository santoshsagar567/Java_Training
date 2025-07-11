import java.util.Scanner;

public class ArrayPrct_Minimum {

    public static void main(String[] args) {

        int [] a = new int[5];
        System.out.println("Enter the elements in an Array: ");
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        int min = a[0];
        System.out.println("Elements in the Array are: ");

        for(int j = 0; j<a.length; j++){
            System.out.print(a[j]+ " ");

            if (a[j]<min){
                min = a[j];
            }

        }

        System.out.println("\nMinimum element in the Array is: "+min);

    }
}
