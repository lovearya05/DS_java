import java.util.Scanner;
public class pattern18{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int spc=n/2;
         int spc1=-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=spc;j++){
                System.out.print("  ");
            }
            System.out.print("* ");
            for(int j=1;j<=spc1;j++){
                System.out.print("  ");
            }
            while(i<n && i>1){
                System.out.print("* ");
            break;
            }
           
            System.out.println("");
         if(i<=(n/2)){
              spc--;
              spc1+=2;
            }
         else{
             spc++;
              spc1-=2;
            }
        }
        
    }
}
