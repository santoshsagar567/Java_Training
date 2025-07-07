import java.util.Scanner;

public class ArrayPrct_2DArrayAddition {

        public static void main(String[] args) {
            int[][] matrixA = {
                    {0, 2, 9},
                    {9, 0, 7}
            };

            int[][] matrixB = {
                    {7, 10, 19},
                    {10, 11, 2}
            };


            int rows = matrixA.length;
            int columns = matrixA[0].length;


            int[][] sumMatrix = new int[rows][columns];


            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }


            System.out.println("Sum of the two matrices:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(sumMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }

}
