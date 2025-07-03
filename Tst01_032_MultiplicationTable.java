import java.util.Scanner;

public class Tst01_032_MultiplicationTable {

    //Multiplication Table Grid
    //➤ Print 1–12 times table as a grid.
    //➤ Purpose: Nested loops, formatting.

    public static void main(String[] args) {

        System.out.println("Enter a number to print its Table: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Multiplication Table for the Number "+num+" is as follows:");
        for (int i = 1;i<=12;i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }

    }
}
