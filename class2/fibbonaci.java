import java.util.Scanner;
public class fibbonaci{
    public static void main(String[] args)
    {
        int a=1;
        int b=1;
    
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
         System.out.println(a);
         int temp=a+b;
         a=b;
         b=temp;
       }
   }
}