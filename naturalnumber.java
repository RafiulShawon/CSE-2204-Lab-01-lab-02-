import java.util.*;
public class naturalnumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();

        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.println(i+ " ");
            sum+=i;
        }
        System.out.println("The sum of natural number is:"+sum);

    }
}
