import java.util.Scanner;
public class pattern16{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int spc=1;
         int str=(n-1)/2;
        for(int i=1;i<n-1;i++){
           if(i==1){
                for(int j=1;j<=n;j++){
                    System.out.print("* ");
                }
            }
            System.out.println("");
            for(int j=1;j<=str;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=spc;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=str;j++){
                System.out.print("* ");
            }
            if(i==n-2){
                System.out.println("");
                for(int j=1;j<=n;j++){
                    System.out.print("* ");
                }
            }
         if(i<=((n-2)/2)){
              spc+=2;
              str--;
            }
         else{
             spc-=2;
             str++;
            }
        }
        
    }
}