import java.util.Scanner;
public class pattern12{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int spc=n/2;
         int nb=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=spc;j++){
                System.out.print("  ");
            }
            int a=1;
            for(int j=1;j<=nb;j++){
                System.out.print(a++ +" ");
            }
        System.out.println(" ");
        if(i<=n/2){
            spc--;
            nb+=2;
        }
        else{
            spc++;
            nb-=2;
            }
        }
    }
}