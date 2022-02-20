import java.util.Scanner;
public class AnyBaseToAnyBase{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no and its base");
        int num=sc.nextInt();
        int bas=sc.nextInt();
        System.out.println("Enter base To convert");
        int to=sc.nextInt();
        int n=anyToDec(num, bas);
        System.out.println(anybase(n,to));   
    }
        static int anyToDec(int num,int b){
            int ans=0;
            int p=0;

            while(num!=0){
                int r=num%10;
                num/=10;
                ans+=(int)Math.pow(b,p)*r;
                p++;
            }
            return ans;
        }
        static int anybase(int num,int b){
            int ans=0;
            int p=1;

            while(num!=0){
                int r=num%b;
                num/=b;
                ans+=p*r;
                p*=10;
            }
            return ans;
        }
    
}