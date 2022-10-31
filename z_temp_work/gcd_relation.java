import java.util.*;
public class gcd_relation {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            printRes();
        }
    }
    static Scanner sc = new Scanner(System.in);

    static void printRes(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();

        for(int i=a;i<=b;i++){
            for(int j=i+1;j<=b;j++){
                int gc = gcd(a,b);
                if(gc==c) {
                    System.out.print("YES");
                    return;
                }
            }
        }
        System.out.print("NO");
        
    }
    static int gcd(int a, int b)
    {
        int result = Math.min(a, b); // Find Minimum of a nd b
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result; // return gcd of a nd b
    }
}
