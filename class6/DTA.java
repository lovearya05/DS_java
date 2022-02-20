import java.util.Scanner;
public class DTA{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int bas=sc.nextInt();
        System.out.println(anybase(num,bas));    
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