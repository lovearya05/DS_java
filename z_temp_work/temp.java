import java.util.Arrays;
import java.util.Scanner;

public class temp{
    public static void main(String[] args ){
        // System.out.print("hello word");
        Scanner sc = new Scanner(System.in);

        // System.out.print("enter input : ");
        // int x = sc.nextInt();

        // int, float, double,long, char, string, boolean,

        // int a = 1;
        // float b = 124;
        // char a = 'c';

        // boolean a = true;
        // System.out.println("enter length of array");
        // int len = sc.nextInt();

        // int[] arr = new int[len];
        
        // for(int i=0;i<len;i++){
        //     System.out.println("enter element : "+ (i+1) +" ");
        //     arr[i] = sc.nextInt();
        // }
        
        // System.out.println(Arrays.toString(arr));

        // loops 

        int[] arr = {1,3,3,7,0,6,4,3};
        
        // for(int x : arr){
        //     System.out.print(x+",");
        // }
        // int i=0;
        // while(i<arr.length){
        //     System.out.println(arr[i++]);
        // }

        // switch (key) {
        //     case value:
                
        //         break;
        
        //     default:
        //         break;
        // }

        // if(){

        // }else if(){

        // }

        //  int sum =  findSum(arr);
        //  System.out.println(sum);

    }

    static int findSum(int[] ary){
        int sum = 0;
        for (int i : ary) {
            sum+=i;
        }
        // System.out.println();
        return sum;
    }
    // System.out.print("hello word");
}