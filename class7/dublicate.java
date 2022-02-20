public class dublicate{
    public static void main(String args[]){
    int arr[]={4,0,3,0,1,1,5,5};
    dub(arr);
    } 
    static void dub(int[] arr){
        int[] frq=new int[arr.length];

        for(int i=0;i<arr.length;i++){
          int val=arr[i];
          frq[val]++;
        }
        for(int i=0;i<frq.length;i++){
            if(frq[i]>1){
                System.out.print(i+" ");
            }
        }
    }
}