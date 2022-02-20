  //              no of occurrence and indexes of occurence
import java.util.Arrays;
public class noindx{
    public static void main(String[] args){
        int arr[]={1,2,3,2};
        int idx=0;
        int temp=5;
        max_occ obj=new max_occ(arr,idx+1,temp);
        int brr[]=obj.createArray();
        //System.out.print(max_occ(arr,idx,temp));
        display(brr);
    }
    public static int max_occ(int[] arr,int idx,int temp){
        if(idx==arr.length)return 0;
        int i=0;
        i=max_occ(arr,idx+1,temp);
        if(arr[idx]==temp) i++;
        
        return i;
    }
    static void display(int[] ar){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}