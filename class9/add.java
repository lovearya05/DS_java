public class add{
    public static void main(String[] args)
    {
       int[] arr={2,3,0,5};
       int[] brr={2,6};

       add(arr,brr);
    }

    static void add(int[] arr,int[] brr){
        int sz=arr.length>brr.length? arr.length : brr.length;
        int[] ans=new int[sz+1];
        int i=arr.length-1;
        int j=brr.length-1;
        int k=ans.length-1;

        int c=0;
        while(k>=0){
            int sum=c;

            if(i>=0){
                sum+=arr[i];
            }
            if(j>=0){
                sum+=brr[j];
            }

            c=sum/10;
            if(sum>9){
                sum%=10;
            }
            ans[k]=sum;
            i--;
            j--;
            k--;

        }
        if(ans[0]!=0){
            System.out.print(ans[0]+" ");
        }
        for(i=1;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}