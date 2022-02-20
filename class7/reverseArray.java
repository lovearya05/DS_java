public class reverseArray{
    public static void main(String args[]){
    int arr[]={1,2,3,4,5,6};
    reverse(arr);
    display(arr);
    } 
    static void reverse(int[] arr){
        int m=arr.length-1;
        int n;
        if(m%2==0){
            n=m/2;
        }else{
            n=(m+1)/2;
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i]+arr[m-i];
            arr[m-i]=arr[i]-arr[m-i];
            arr[i]=arr[i]-arr[m-i];
        }
    }
    static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    } 
}