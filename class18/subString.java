//   storing substrings in new array

import java.util.ArrayList;
public class subString{
    public static void main(String[] args){
        String str="abcd";
        ArrayList<String> ans=getSubsq(str,"");

        System.out.println(ans);
        System.out.print(ans.size());

    }
    static ArrayList<String> getSubsq(String str,String ans){
        if(str.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add(ans);
            return base;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);

        ArrayList<String> recans1=getSubsq(ros,ans);
        ArrayList<String> recans2=getSubsq(ros,ans+ch);

        ArrayList<String> retans=new ArrayList<>();

        retans.addAll(recans1);
        retans.addAll(recans2);
        return retans;
    }
}