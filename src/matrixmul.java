import java.util.Scanner;
public class matrixmul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows of first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter number of columns of first matrix (and rows of second matrix): ");
        int cols1Rows2 = scanner.nextInt();
        System.out.print("Enter number of columns of second matrix: ");
        int cols2 = scanner.nextInt();

        // Initialize matrices
        int[][] matrix1 = new int[rows1][cols1Rows2];
        int[][] matrix2 = new int[cols1Rows2][cols2];
        int[][] resultMatrix = new int[rows1][cols2];

        // Read first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1Rows2; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Read second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < cols1Rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < cols1Rows2; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Print result matrix
        System.out.println("Resulting matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
