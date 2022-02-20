import java.util.Scanner;
public class p1{
    public static void main(String[]args){
       int[] arr={1,0,1,1,0,0,1,2,0,1,2,0};

       // sag1(arr,-2,3);
        sag2(arr);
        disp(arr);
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void sag2(int[] arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
            }
            if(arr[mid]==1){
                mid++;
            }
        }

    }
    static void sag1(int[] arr,int sagfrom,int sagto){
        int i=0;
        for(int j=sagfrom;j<=sagto;j++){
            int al=arr.length-1;
            while(i<al){
                if(arr[i]<j){
                    i++;
                }else{
                    int temp=arr[i];
                    arr[i]=arr[al];
                    arr[al]=temp;
                    al--;
                }
            }
            
        }
    }
    static int disp(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        return 0;
    }

}