//finding minimum in a  rotated sorted array
import java.util.Scanner;

public class minimumsortednumberLab2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];  // Start with first element
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum number is: " + min);
        sc.close();
    }
}
