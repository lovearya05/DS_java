import java.util.Scanner;
public class pattern4{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int nsp=n/2;
         int nst=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                  System.out.print("* "); 
                }              
            
            if(i<=n/2){
                nsp--;
                nst++;
            }else{
                nsp++;
                nst--;
            }
            System.out.println("");
        
        }
    }
}