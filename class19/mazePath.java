//                                      maze path (1-jump row-column) by post order 
import java.util.ArrayList;
public class mazePath{
    public static void main(String[] args)
    {
        int dr=2;
        int dc=2;
        int sr=0;
        int sc=0;
        ArrayList<String> ans=maze(sr,sc,dr,dc);
        System.out.print(ans);
        
        int count=0;
        for(String s:ans){
           count++;
       }
       
       System.out.println(count);
    }  

    
    public static ArrayList<String> maze(int sr,int sc,int dr,int dc){
        if(sr>dr || sc>dc){
            ArrayList<String> nil=new ArrayList<>();
            return nil;
        }
        if(sr==dr && sc==dc){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> vert=maze(sr+1,sc,dr,dc);
        ArrayList<String> hori=maze(sr,sc+1,dr,dc);
        
        ArrayList<String> recans=new ArrayList<>();
        for(String s:vert){
            recans.add("V"+" "+s+" ");
        }
        for(String s:hori){
            recans.add("H"+" "+s+" ");
        }   
        return recans;
    }
}