import java.util.Scanner;
public class assignment{
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("Enter the no to find : ");
        int temp=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            System.out.print("enter element of index : "+i+"  ");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==temp){
                System.out.print("no is at index :"+i);
                return;
            }
        }
    }
    
}