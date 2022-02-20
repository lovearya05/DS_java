import java.util.Scanner;
public class pattern8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==1){
                for(int j=1;j<=((n/2)+1);j++){
                    System.out.print("* ");
                }
                for(int j=1;j<=((n/2)-1);j++){
                    System.out.print("  ");
                }
                System.out.println("* ");
            }else{
                if(i==2){
                     for(int j=1;j<=((n/2)-1);j++){
                          for(int k=1;k<=n/2;k++){
                              System.out.print("  ");
                            }
                            System.out.print("* ");
                           for(int k=1;k<=((n/2)-1);k++){
                              System.out.print("  ");
                            }
                            System.out.println("* ");
                        }
                }
            }
            if(i==((n/2)+1)){
                for(int j=1;j<=n;j++){
                    System.out.print("* ");
                }
                System.out.println("");
            }
           if(i==n-1){
                for(int a=1;a<=((n/2)-1);a++){
                    System.out.print("* ");
                    for(int k=1;k<=((n/2)-1);k++){
                        System.out.print("  ");
                    }
                    System.out.println("* ");
                }
            }
            if(i==n){
                System.out.print("* ");
               for(int k=1;k<=((n/2)-1);k++){
                        System.out.print("  ");
               }
               for(int j=1;j<=(n/2)+1;j++){
                   System.out.print("* ");
               }
            }
            
        }
    }
}