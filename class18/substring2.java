//   storing substrings in new array

import java.util.ArrayList;
public class subString2{
    public static void main(String[] args){
        String str="abc";
        ArrayList<String> ans=getSubsqWay2(str);

        System.out.println(ans);
        System.out.print(ans.size());

    }
    static ArrayList<String> getSubsqWay2(String str){
        if(str.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }

        String ros=str.substring(1);

        ArrayList<String> recans=getSubsqWay2(ros);
        //post area
        ArrayList<String> ans=new ArrayList<>();
        ans.addAll(recans);

        char ch=str.charAt(0);
        
        for(String s:recans){
            ans.add(ch+s);
        }

        return ans;
    }
}