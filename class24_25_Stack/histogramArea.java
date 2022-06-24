import java.util.Stack;
import java.util.Arrays;;

public class histogramArea {
    public static void main(String[] args) {
        int[] arr = {6,2,5,4,5,1,6};
        
        System.out.println(findArea(arr));
    }
    static int findArea(int[] arr){
        int ans=0;
        int[] nse = new int[arr.length];
        int[] pse = new int[arr.length];
        nextSmallestElement(arr,nse);
        previousSmallestElement(arr,pse);

        for(int i=0;i<arr.length;i++){
            ans = Math.max(ans,(nse[i]-pse[i]-1)*arr[i]);
        }

        // System.out.println(Arrays.toString(pse));

        return ans;
    }
    static void previousSmallestElement(int[] arr,int[] ans){
        //left to right
        Stack<Integer> st=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            if(st.size()==0){
                st.push(i);
            }else{

                while(st.size()>0 && arr[st.peek()]>arr[i]){
                    ans[st.pop()]=i;
                }
                st.push(i);
            }
        }

        while(st.size()>0){
            ans[st.pop()]=-1;
        }
    }
    static void nextSmallestElement(int[] arr,int[] nse){
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<arr.length;i++){

            while(st.size()>0 && arr[st.peek()]>arr[i]){
                nse[st.pop()] = i;
            }

            st.push(i);
        }
        while(st.size()>0){
            nse[st.pop()] = arr.length;
        }

    }
}
