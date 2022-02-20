public class _01sag{
    public static void main(String[] args)
    {
       int[] arr={1,0,1,0,1,1,1,0,0,1};
       sag(arr);
       display(arr);
    }   
    static void sag(int[] arr){
        int ind=0; int bp=0;
        for(int i=0;i<arr.length;i++){
            if(i==0 && bp==0){
                bp=1;
                ind=i;          
            }
            if(arr[i]==0){
                if(bp==1){
                    arr[i]=1;
                    arr[ind]=0;
                    ind++;
                }
            }
        }
    }    
    static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}