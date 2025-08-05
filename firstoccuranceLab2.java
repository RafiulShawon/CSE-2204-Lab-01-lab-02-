import java.util.*;

public class firstoccurance {
    public static int findfirstoccurance(int[]arr,int x)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the size of array:");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the values of array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target element:");
        int x=sc.nextInt();
        
        int index=findfirstoccurance(arr,x);
        System.out.println("Fist occurance index:"+index);
    }
}
