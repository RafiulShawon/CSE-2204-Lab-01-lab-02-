import java.util.*;
public class floydTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n= sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            int x;
            if(i%2==1)
            {
                x=1;
            }
            else
            {
                x=0;
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(x);
                
                if(x==1){
                    x=0;
                }
                else{
                    x=1;
                }
            }
            System.out.println();
        }
        
    }
}
