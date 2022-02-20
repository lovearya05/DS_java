import java.util.Scanner;
public class Q3{
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("Enter the no to find : ");
        int temp=sc.nextInt();
        
        input(arr);
        arr=sort(arr,n);
        int idx=binarysearch(arr,0,arr.length-1,temp);
        System.out.print("\nNumber is at index "+idx);
        
    }
    static int[] sort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    static int binarysearch(int[] arr,int low,int high,int temp){
        if(high>=low){
            int mid=low+(high-low)/2;
            if(arr[mid]==temp) return mid;
            if(temp>arr[mid]){
                //right
                return binarysearch(arr,mid+1,high,temp);
            }
            if(temp<arr[mid]){
                //left
                return binarysearch(arr,low,mid-1,temp);
            }
        }
        return -1;
    }
    
    static void input(int[] arr){
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            System.out.print("enter element of index : "+i+"  ");
            arr[i]=sc.nextInt();
        }

       
    }
    
}