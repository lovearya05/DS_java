//                                               Dialpad in post order
import java.util.ArrayList;
public class dialpad{
    static String[] keys={"#",".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args){
        
        System.out.print(kpc("234"));

        
    }
    static ArrayList<String>kpc(String str){
        if(str.length()==0){
           ArrayList<String> base=new ArrayList<>();
           base.add("");
           return base;
        }

        ArrayList<String> recans=kpc(str.substring(1));

        char ch=str.charAt(0);
        int idx=ch-48;

        String presskey=keys[idx];
        ArrayList<String> ans=new ArrayList<>();
        //for(char c:presskey.toCharArray()){
            for(int i=0;i<presskey.length();i++){
                char c=presskey.charAt(i);
                for(String s:recans){
                    ans.add(c+s);
                }
            }
            return ans;

    }

}