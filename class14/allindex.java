//     all occurence of a number and its indexes..
public class allindex{
    public static void main(String[] args)
    {
        int[] arr={1,2,2,3,5,2};
        int num=2;
        int[] ans=alloccindex(arr,0,0,num);

        for(int i:ans){//for each loop
            System.out.print(i+" ");
        }
    }
public static int[] alloccindex(int[] arr,int idx, int count,int num) {
    if(idx==arr.length){
        int[] base=new int[count];
        return base;
    }
    // pre area
    if(arr[idx]==num){
        count++;
    }
    int[] recarr=alloccindex(arr,idx+1,count,num);
    // post area
    if(arr[idx]==num){
        recarr[count-1]=idx;
    }
    return recarr;

}

}