import java.util.Scanner;
public class pattern7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int spc=1;
        int str=1;
        int spc1=n/2;

        for(int i=1;i<=n;i++){
            if(i==1){
                for(int j=1;j<=n;j++){
               System.out.print("*  ");
               }
               System.out.println();
            }else{
            for(int j=1;j<=spc;j++){
               System.out.print("   ");   
            }
            for(int j=1;j<=str;j++){
               System.out.print("*  ");   
            }
            while(i>1){
                for(int j=1;j<=spc1;j++){
                   System.out.print("   ");
                }
                break;
            }
            if(i>=1 && i<=(n-1)/2){
                System.out.print("*  ");
            }               
            System.out.println();
            if(i<=n/2){
                str=1;
                spc++;
                spc1-=2;
            }else{
                spc--;
                str+=2;
            }
            }
        }
    }
}