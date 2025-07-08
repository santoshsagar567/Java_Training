public class ArrayPrct_2DArrayTranspose {

        //Program to Transpose of a matrix is obtained by changing rows to columns and columns to rows.
        // In other words, the transpose of matrix A[ ][ ] is obtained by changing A[i][j] to A[j][i].

        public static void main(String[] args) {
            int[][] matrixA = {
                    {4, 2, 9},
                    {5, 8, 7},
                    {6, 1, 3}

            };

            int rows = matrixA.length;
            int columns = matrixA[0].length;

            System.out.println("Original matrix is:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrixA[i][j] + " ");
                }
                System.out.println();
            }

            int columns1 = matrixA.length;
            int rows1 = matrixA[0].length;
            System.out.println("Transpose of the matrix is:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns1; j++) {
                    System.out.print(matrixA[j][i] + " ");
                }
                System.out.println();
            }
        }

}
