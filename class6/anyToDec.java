import java.util.Scanner;
public class anyToDec{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int bas=sc.nextInt();
        System.out.println(anyToD(num,bas));    
    }
        static int anyToD(int num,int b){
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
    
}