import java.util.Scanner;

public class prime {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==0)
        {
            System.out.println("the number is prime");
        }
        else
        {
            System.out.println("not a prime");
        }
        sc.close();
    }
    
}
