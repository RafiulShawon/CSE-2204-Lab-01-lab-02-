import java.util.Scanner;

public class lab2prblm2 {

    public static int findIndex(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            
            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
           
            else {
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;  // Target not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter elements of rotated sorted array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target value
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

       
        int index = findIndex(arr, target);
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found.");
        }

        sc.close();
    }
}
