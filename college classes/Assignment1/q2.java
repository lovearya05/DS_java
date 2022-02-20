import java.util.Scanner;
public class q2{
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("Enter the no to find : ");
        int temp=sc.nextInt();
        
        input(arr);
        int val=count(arr,temp);
        int[] brr=new int[val];
        find(arr,brr,temp);

        disp(brr);
    }
    static void find(int[] arr,int[] brr,int temp){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==temp){
                brr[c]=i;
                c++;
            }
        }
    }
    static int count(int[] arr,int temp){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==temp) c++;
        }
        return c;
    }
    static void disp(int[] brr){
        System.out.print("\n Number is at index : ");
        for(int i=0;i<brr.length;i++){
            System.out.print(brr[i]+",  ");
        }
    }
    static void input(int[] arr){
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            System.out.print("enter element of index : "+i+"  ");
            arr[i]=sc.nextInt();
        }
    }
}