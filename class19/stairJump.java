//                                  steps when max jump=3 in post order
import java.util.ArrayList;
public class stairJump{
    public static void main(String[] args)
    {
        ArrayList<String> ans=getPath(4);
        System.out.print(ans);
        
        int count=0;
        for(String s:ans){
           count++;
       }
       
       System.out.println("\t"+count);
        
    }
public static ArrayList<String> getPath(int n) {

    if(n<0)return new ArrayList<>();


    if(n==0){
        ArrayList<String> base=new ArrayList<>();
        base.add("");
        return base;
    }

    ArrayList<String> ans=new ArrayList<>();

    ArrayList<String> one=getPath(n-1);
    ArrayList<String> two=getPath(n-2);
    ArrayList<String> three=getPath(n-3);
    for(String s:one){
        ans.add("1"+s);
    }
    for(String s:two){
        ans.add("2"+s);
    }
    for(String s:three){
        ans.add("3"+s);
    }

    return ans;
}

}