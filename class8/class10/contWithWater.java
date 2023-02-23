public class contWithWater{
    public static void main(String[] args)
    {
         int[] arr={1,8,6,2,5,4,8,3,7};
         res(arr);
    }

    static void res(int[] arr){
        int i=0;
        int j=arr.length-1;
        int max=0;
        while(i<j){
            int sum=arr[i]<arr[j]?arr[i]*(j-i) : arr[j]*(j-i);
            if(sum>max){
                max=sum;
            }
            if(arr[i]==arr[j]){
                // i++;
                j--;
            }else if(arr[i]>arr[j]){
                j--;
            }else if(arr[i]<arr[j]){
                i++;
            }
        }
        System.out.print(" "+max);
    }    
}