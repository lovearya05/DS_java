public class subtArray{
    public static void main(String[] args)
    {
       int[] arr={6,4,5,0,5};
       int[] brr={6,4,4,0,4};

       subt(arr,brr);
    }

    static void subt(int[] arr,int[] brr){
        int sz=arr.length>brr.length? arr.length : brr.length;
        int[] ans=new int[sz];
        int i=arr.length-1;
        int j=brr.length-1;
        int k=ans.length-1;
        int b=0;
        while(k>=0){
            int sub=b;
            if(j>i){
                   if(i>=0){
                      sub-=arr[i];
                    }
                   if(j>=0){
                      sub+=brr[j];
                    }
            }else{
                   if(i>=0){
                       sub+=arr[i];
                      }
                    if(j>=0){
                       sub-=brr[j];
                    }
            }
             b=0;
            if(sub<0){
                sub+=10;
                b=-1;
            }
            ans[k]=sub;
            i--;
            j--;
            k--;

        }
           int a=0;
        for(i=0;i<ans.length;i++){
            if(ans[i]>0 || a==1){
                System.out.print(ans[i]+" ");
                a=1;
            }
        }
    }
    
}