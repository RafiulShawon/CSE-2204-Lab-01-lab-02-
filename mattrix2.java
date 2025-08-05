//ii) Rewrite the previous problem to make therow parameter of the matrix as a default argument
import java.util.Scanner;

public class mattrix2 {
    public static void main(String[] args) {
        int m = 4;  // Default number of rows
        int n;

        int[][] matrix = new int[100][100]; 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        n = sc.nextInt();

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix (" + m + " x " + n + "):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        
    }
}

