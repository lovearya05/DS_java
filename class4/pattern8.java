import java.util.Scanner;
public class pattern8{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=65;
            for(int j=0;j<i;j++){
                System.out.print((char)a +" ");
                a++;
            }
        System.out.println(" ");
        }
    }
}