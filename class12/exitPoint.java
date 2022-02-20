// when Get 1 Rotate Pointer By 90॰ And Show the Exit Point
import java.util.Scanner;
public class exitPoint{
     static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][] arr=new int[r1][c1];
        input(arr);
        exitPoint(arr);
    }
    static void exitPoint(int[][] arr){
        int d=0;
        int i=0;
        int j=0;

        while(true){
            d+=arr[i][j];
            d%=4;

            if(d==0) j++;
            else if(d==1) i++;
            else if(d==2) j--;
            else i--;

            if(i<0){
                i++;
                System.out.println(i+"-"+j);
                return;
            }else if(i>=arr.length){
                i--;
                System.out.println(i+"-"+j);
                return;
            }else if(j<0){
                j++;
                System.out.println(i+"-"+j);
                return;
            }else if(j>=arr[0].length){
                j--;
                System.out.println(i+"-"+j);
                return;
            }
        }
       
    }
static void input(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
}

