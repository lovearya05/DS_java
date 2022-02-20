import java.util.Scanner;
public class noLength{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int n=sc.nextInt();
        int count=0;  
        int temp=n;
        while(temp!=0)
        {
             temp/=10;
             count++;
        
        }
        System.out.println(count);
    }
}