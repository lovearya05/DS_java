public class inversePlc{
    public static void main(String args[]){
    int arr[]={4,0,3,2,1};
    int ar[]={0,0,0,0,0};
    inverse(arr,ar);
    display(ar);
    } 
    static void inverse(int[] arr,int[] ar){
        for(int i=0;i<arr.length;i++){
            int m=arr[i];
            ar[m]=i;          
        }
    }
    static void display(int[] ar){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    } 
}