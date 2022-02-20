public class majority{
    public static void main(String[] args)
    {
         int[] arr={3,3,4,2,4,4,2,4,4,3,3,3,3};
         maj(arr);
    }

    static void maj(int[] arr){
        int majority=-1;
        int c=0;
      for(int i=0;i<arr.length;i++){
          if(majority==-1){
              majority=arr[i];
              c++;
          }else if(majority==arr[i]){
              c++;
          }
          else if(c>0){
              c--;
          }else{
              majority=arr[i];
              c++;
            }
        }
      System.out.print(majority);
    }    
}