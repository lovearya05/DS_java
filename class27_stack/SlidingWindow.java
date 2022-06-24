package class27_stack;
import java.util.Stack;
import java.util.Arrays;
public class SlidingWindow {
    static int[] ngeRight(int[] arr){
        //left to right
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<arr.length;i++){
            if(st.size()==0){
                st.push(i);
            }else{

                while(st.size()>0 && arr[st.peek()]<arr[i]){
                    ans[st.pop()]=i;
                }
                st.push(i);
            }
        }

        while(st.size()>0){
            ans[st.pop()]=arr.length;
        }
        return ans;
    }   
    static int[] maxKwind(int[] arr,int k){
        int[] nge=ngeRight(arr);
        // System.out.println(Arrays.toString(nge));
        int[] ans=new int[arr.length-k+1];

        for(int i=0;i<=arr.length-k;i++){

            if(i+k-1<nge[i]){
                ans[i]=arr[i];
            }else{

                int j=nge[i];

                while(i+k-1>=nge[j]){
                    j=nge[j];
                }
                ans[i] = arr[j];
            }
        }
        return ans;
    }


    public static void main(String[] args){
        int[] arr={6,2,3,1,5,6,5,4,7};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(maxKwind(arr,3)));
    }
    
}
