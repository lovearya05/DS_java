import java.util.Stack;
import java.util.Arrays;
public class SNQ {
    public static boolean dupicateBa(String str){
        Stack<Character> st=new Stack<>();

        for(int i=0;i<str.length();i++){
            
            char ch=str.charAt(i);

            if(ch==')'){

                if(st.peek()=='('){
                    return true;
                }
                while(st.peek()!='('){
                    st.pop();
                }

                st.pop();

            }else{
                st.push(ch);
            }
        }

        return false;
    }
    public static boolean balanceOrNot(String str){
        Stack<Character> st=new Stack<>();

        for(char ch:str.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }else if(ch==')' && (st.peek()=='{' || st.peek()=='[')){
                return false;
            }else if(ch==']' && (st.peek()=='(' || st.peek()=='{')){
                return false;
            }else if(ch=='}' && (st.peek()=='(' || st.peek()=='[')){
                return false;
            }else if(ch==')' || ch==']' || ch=='}'){
                st.pop();
            }
        }
        return true;
    }
    static int[] ngeLeftToRightIdx(int[] arr){
        //left to right
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<arr.length;i++){
            if(st.size()==0){
                st.push(i);
            }else{

                while(st.size()>0 && arr[st.peek()]<arr[i]){
                    ans[st.pop()]=arr[i];
                }
                st.push(i);
            }
        }

        while(st.size()>0){
            ans[st.pop()]=-1;
        }
        return ans;
    }
    static int[] ngeRightToLeftVal(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            if(st.size()==0){
                st.push(arr[i]);
            }else{

                while(st.size()>0 && st.peek()<arr[i]){
                    st.pop();
                    // st.push(arr(i));
                }
                if(st.size()>0 && st.peek()>arr[i]){
                    ans[i]=st.peek();
                }
                st.push(arr[i]);
            }
        }
        return ans;
    }
    static int[] ngeRightToLeftIdx(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            if(st.size()==0){
                st.push(i);
            }else{

                while(st.size()>0 && arr[st.peek()]<arr[i]){
                    st.pop();
                    // st.push(arr(i));
                }
                if(st.size()>0 && arr[st.peek()]>arr[i]){
                    ans[i]=arr[st.peek()];

                }
                st.push(i);
            }
        }
        while(st.size()>0){
            st.pop();
        }
        return ans;
    }
    static int[] nseRight(int[] arr){
        //left to right
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<arr.length;i++){
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
            ans[st.pop()]=arr.length;
        }
        return ans;
    }
    static int[] nseLeft(int[] arr){
        //left to right
        int[] ans=new int[arr.length];
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
        return ans;
    }
    static int findMaxArea(int[] arr){
        int[] nseR=nseRight(arr);
        int[] nseL=nseLeft(arr);
        System.out.println(Arrays.toString(nseL));
        System.out.println(Arrays.toString(nseR));

        int max=-1;
        for(int i=0;i<arr.length;i++){
            int len=(nseR[i]-nseL[i])-1;
            if(arr[i]*len>=max){
                max=arr[i]*len;
            }
        }

        return max;

    }



    public static void main(String[] args){
        // System.out.println(dupicateBa("((a+((b+c))+d))"));
        // int[] arr={6,2,5,4,5,1,6};
        // System.out.println(findMaxArea(arr));
        // System.out.println(Arrays.toString(ngeLeftToRightIdx(arr)));
        // System.out.println(Arrays.toString(ngeRightToLeftVal(arr)));
        // System.out.println(Arrays.toString(ngeRightToLeftIdx(arr)));
        // System.out.println(balanceOrNot("[a+{a+(d+e)}]"));
    }
    
}
