public class nStackUsingArray {
    static char[] arr=new char[10];
    static int[] top=new int[4];
    static int[] next={1,2,3,4,5,6,7,8,9,10};
    static int free=0;
    static void push(char val,int st){
        arr[free]=val;
        int place=free;
        free=next[place];
        next[place]=top[st];
        top[st]=place;
    }
    static char pop(int st){
        int ans_idx=top[st];
        char ans=arr[ans_idx];
        top[st]=next[ans_idx];
        next[ans_idx]=free;
        free=ans_idx;
        return ans;
    }

    public static void main(String[] args) {
        push('a',1);
        System.out.println(pop(1));
    }
    
}
