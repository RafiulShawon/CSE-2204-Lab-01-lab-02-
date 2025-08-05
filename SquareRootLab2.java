import java.util.*;

public class SquareRoot {
    
    public static int findSquareRoot(int num) {
        if (num == 0 || num == 1) {
            return num;
        }

        int start = 1;
        int end = num;
        int result = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;

            if (square == num) {
                return mid;
            } else if (square < num) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;  // Integer part of square root
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sqrt = findSquareRoot(num);
        System.out.println("Square root is: " + sqrt);
        sc.close();
    }
}
