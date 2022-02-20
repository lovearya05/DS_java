//                                  ..index of a no in array from starting using recursion..

public class indx{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,5,5,2};
        int idx=0;
        int temp=5;
        System.out.print(ind(arr,idx,temp));
    }
    public static int ind(int[] arr,int idx,int temp){
        if(idx==arr.length)return -1;
        if(arr[idx]==temp)return idx;
        return ind(arr,idx+1,temp);
    }
}