  //                                  ..index from back side using recursion..

public class indx1{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,4,5,8,7,5};
        int idx=0;
        int temp=5;
        System.out.print(ind(arr,idx,temp));
    }
    public static int ind(int[] arr,int idx,int temp){
        int i=0; 
        if(idx==arr.length)return -1;
        
        i=ind(arr,idx+1,temp);
        if(arr[idx]==temp && i<idx){
           i=idx;
        }  
        
        return i;
    }
}