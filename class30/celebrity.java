// package class30;
import java.util.Stack;

import javax.print.FlavorException;
public class celebrity{
    public static void main(String args[]){
        int[][] arr={
            {1,1,0,1,1,1},
            {0,1,0,1,0,1},
            {1,0,1,1,1,1},
            {0,0,0,1,0,1},
            {1,1,0,1,1,1},
            {0,0,0,0,0,1}
        };
        findCelebrity(arr);
    }
    static void findCelebrity(int[][] arr){
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            for(int j=0;j<arr[0].length;j++){
                if(i==j) continue;
                if(arr[i][j]==1){
                    flag=false;
                    break;
                }
            }
            if(flag) st.push(i);
        }
        while(st.size()>0){
            int col = st.pop();
            boolean flag=true;
            for(int i=0;i<arr.length;i++){
                if(arr[i][col]==0) flag=false;
            }

            if(flag) System.out.println(col);
        }
    }
}