import java.util.*;
public class fact {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=1;
        for(int i=2;i<=n;i++)
        {
            f*=i;
        }
        System.out.println("factorai is"+f);
        sc.close();
    }
}
