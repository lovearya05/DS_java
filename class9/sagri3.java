public class sagri3{
    public static void main(String[] args)
    {
         int[] arr={1,0,2,0,1,2,1,0,2};
         ndf(arr);
        display(arr);
    }
    static void ndf(int[] arr){
      int zero=-1;
      int i=0;
      int sag=2;

    for(int j=0;j<=sag;j++){
      int al=arr.length-1;
      while(i<al){
          if(arr[i]<j){
              zero++;
              i++;

          }else{
              int temp=arr[i];
              arr[i]=arr[al];
              arr[al]=temp;
              al--;
          }
       }
    }
    
    /* while(i<al){
          if(arr[i]<2){
              zero++;
              i++;

          }else{
              int temp=arr[i];
              arr[i]=arr[al];
              arr[al]=temp;
              al--;
          }
        }*/
    }
    static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    
    
}