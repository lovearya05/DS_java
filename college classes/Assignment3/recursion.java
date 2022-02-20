import java.util.Scanner;
public class recursion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // int n=21;
        // int a=0;
        // int b=1;
        // System.out.println("fibbonacci series");
        // fibbonaci(a,b,n);
        System.out.println("Enter No to find factorial :");
        int n=sc.nextInt();
        System.out.println("\nfactorial");
        System.out.println(factorial(n));
    }
    static int factorial(int n){
        if(n==0) return 1;
        int ans=n*factorial(n-1);
        return ans;
         
    }
    // static void fibbonaci(int a,int b,int n){
    //     System.out.print(a+" ");
    //     int temp=a;
    //     a=b;
    //     b=a+temp;
    //     if(a>n)return;
    //     fibbonaci(a,b,n);
    // }
}
