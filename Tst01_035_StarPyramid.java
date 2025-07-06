import java.util.Scanner;

public class Tst01_035_StarPyramid {

    //Star Pyramid Pattern
    //➤ Build pyramid using *.
    //➤ Purpose: Loop + formatting.

    public static void printStars(int len){

        for (int i = 1; i <= len; i++) {

            // Inner loop for printing spaces before stars
            // Decreases the number of spaces as 'i' increases
            for (int j = 1; j <= len - i; j++) {
                System.out.print(" ");
            }

            // Inner loop for printing stars
            // Prints (2*i - 1) stars in each row to form the pyramid shape
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line after each row is printed
            System.out.println();
        }

    }

    public static void main(String[] args) {

        System.out.println("Star Pyramid Pattern : ");
        int n = 6;
        printStars(n);

    }
}
