import java.util.*;
public class countoccurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array number:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target value:");
        int x=sc.nextInt();

        int count=0;
        for(int i=0;i<n;i++)
        {
            if (arr[i]==x) {
                count++;
            }
        }
        System.out.println("number of occourance is:"+count);
    }
}
