import java.util.Stack;
import java.util.Arrays;
public class stock_span {
    static int[] stock_span(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(st.size()==0){
                st.push(i);
                ans[i]=1;
            }else if(arr[st.peek()]>arr[i]){
                st.push(i);
                ans[i]=1;
            }else if(arr[st.peek()]<arr[i]){
                while(st.size()!=0 && arr[st.peek()]<=arr[i]){
                    st.pop();
                }
                if(st.size()==0){
                    ans[i]=i+1;
                    st.push(i);
                }else{
                    ans[i]=i-st.peek();
                    st.push(i);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args){
        int[] arr={100,80,60,70,60,75,85};
        System.out.println(Arrays.toString(stock_span(arr)));
    }
}
