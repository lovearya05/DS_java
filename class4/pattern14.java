import java.util.Scanner;
public class pattern14{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int spc=n/2;
         int nb=1;
         int a=1;
         int b=1;
        for(int i=1;i<=n;i++){
            a=b;
            for(int j=1;j<=spc;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=nb;j++){
                System.out.print(a++ +" ");
            }
        System.out.println(" ");
        if(i<=n/2){
            spc--;
            nb+=2;
            b++;
        }
        else{
            spc++;
            nb-=2;
            b--;
            }
        }
    }
}