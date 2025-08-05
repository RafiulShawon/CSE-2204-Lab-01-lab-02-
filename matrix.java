import java.util.*;
public class matrix {
    static int[][]readmatrix(int m, int n, Scanner sc){
          int[][] matrix=new int[m][n];
        System.out.println("Enter the number of element:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Element ["+i+"]["+j+"]:");
                matrix[i][j]=sc.nextInt();
            }
        }
            return matrix;
      
    }

    static void showMatrix(int[][]matrix,int m,int n)
    {
        System.out.println("the matrix is:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enetr the row number of the matrix :");
        int m=sc.nextInt();

        System.out.println("Enter the column number of the matrix :");
        int n= sc.nextInt();
         
        int[][]matrix= readmatrix(m, n, sc);
        showMatrix(matrix, m, n);

        sc.close();
    }
}
            