import java.util.Scanner;
public class pattern10{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int str=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<str;j++){
                System.out.print("* ");
            }
        System.out.println(" ");
        if(i<=n/2){
        str++;
        }
        else{
            str--;
        }
        }
    }
}