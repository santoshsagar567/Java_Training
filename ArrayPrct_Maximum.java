import java.util.Scanner;

public class ArrayPrct_Maximum {

    public static void main(String[] args) {

        int [] a = new int[5];
        System.out.println("Enter the elements in an Array: ");
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        int max = a[0];
        System.out.println("Elements in the Array are: ");

        for(int j = 0; j<a.length; j++){
            System.out.print(a[j]+ " ");

            if (a[j]>max){
                max = a[j];
            }

        }

        System.out.println("\nMaximum element in the Array is: "+max);

    }
}
