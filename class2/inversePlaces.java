import java.util.Scanner;
public class inversePlaces{
    public static void main(String[] args)
    {
       int a=0,b=0,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no to reverse");
        int n=sc.nextInt();
        
        while(n!=0){
            a=n%10;
            int p=(int)Math.pow(10, a-1);
            b=b+(++count*p);
            n/=10;
            
        }
        System.out.println(b);
    
   }
}