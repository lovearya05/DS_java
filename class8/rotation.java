public class rotation{
    public static void main(String args[]){
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    rotate(arr,5);
    display(arr);
    } 
    static void rotate(int[] arr,int k){
        int sz=arr.length;
        k%=sz;

        if(k<0){
            k+=sz;
        }
        reverse(arr,0,k-1);
        reverse(arr,k,sz-1);
        reverse(arr,0,sz-1);
    }
    static void reverse(int[] arr,int l,int r){
      
         r=arr.length-1;        //rotate first k element
         while(l<r){
             int temp=arr[l];
             arr[l]=arr[r];
             arr[r]=temp;
             l++;
             r--;
         }
    }
    
    
    static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    } 
}