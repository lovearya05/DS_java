import java.util.Scanner;
public class reverseNo{
    public static void main(String args[]){
        int a=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no to reverse");
        int n=sc.nextInt();
        while(n!=0){
            a=a*10+n%10;
            n/=10;
        }
        System.out.println(a);
    }

}