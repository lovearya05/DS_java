import java.util.Scanner;
public class pattern6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int spc=0;
        int str=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=spc;j++){
               System.out.print("  ");   
            }
            if(i==(n+1)/2){
                System.out.print("*");
            }
            for(int j=1;j<=str;j++){
               System.out.print(" *");   
            }
            System.out.println();
            if(i<=n/2){
                spc++;
                str-=2;
            }else{
                spc--;
                str+=2;
            }
        }
    }
}