import java.util.Scanner;
public class printdigits{
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

        int p=(int)Math.pow(10, count-1);

        while(p!=0){
            int q=n/p;
            n%=p; //n=n%p;
            System.out.println(q);
            p/=10;
        }
    
   }
}