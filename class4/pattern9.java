import java.util.Scanner;
public class pattern9{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a=65;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)a + "  ");
                a++;
            }
        System.out.println();
        }
    }
}