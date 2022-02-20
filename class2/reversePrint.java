import java.util.Scanner;
public class reversePrint{

    public static void main(String args[]){
        
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a Number");
         int n=sc.nextInt();

     while(n!=0){
         int a=n%10;
          n/=10;
          System.out.println(a);
        }
    }

    }