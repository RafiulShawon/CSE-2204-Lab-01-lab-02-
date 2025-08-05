//Given an array of integers nums and a target value target, return the indices of the two numbers that add up to the target.

import java.util.Scanner;

public class targetArrayvalue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, target;
        int[] nums = new int[100];  

        System.out.print("Enter array size: ");
        n = input.nextInt();

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        System.out.print("Enter target value: ");
        target = input.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Indices: " + i + " " + j);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("No two elements found .");
        }

        input.close();
    }
}
