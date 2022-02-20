  //                              no of occurrence of no

public class noOcc{
    public static void main(String[] args){
        int arr[]={1,2,3,5,2,6,9,4,2,5,4};
        int idx=0;
        int temp=5;
        System.out.print(max_occ(arr,idx,temp));
    }
    public static int max_occ(int[] arr,int idx,int temp){
        if(idx==arr.length)return 0;
        int i=0;
        i=max_occ(arr,idx+1,temp);
        if(arr[idx]==temp) i++;
        
        return i;
    }
}