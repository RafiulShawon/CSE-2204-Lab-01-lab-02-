
  //Given two matrices A (Dimension m*n) and B (Dimension n*p), perform matrix multiplication and return the resulting matrix.
import java.util.Scanner;

public class marix3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n, p;

        System.out.print("Enter number of rows of matrix A (m): ");
        m = sc.nextInt();

        System.out.print("Enter number of columns of matrix A / rows of matrix B (n): ");
        n = sc.nextInt();

        System.out.print("Enter number of columns of matrix B (p): ");
        p = sc.nextInt();

        int[][] A = new int[100][100];
        int[][] B = new int[100][100];
        int[][] C = new int[100][100];

        System.out.println("Enter elements of matrix A (" + m + " x " + n + "):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of matrix B (" + n + " x " + p + "):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix A (" + m + " x " + n + "):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Matrix B (" + n + " x " + p + "):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(B[i][j] + "  ");
            }
            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                C[i][j] = 0;
            }
        }

        // Matrix multiplication: C = A x B
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("\nResulting Matrix C (A x B) (" + m + " x " + p + "):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(C[i][j] + "  ");
            }
            System.out.println();
        }

        
    }
}