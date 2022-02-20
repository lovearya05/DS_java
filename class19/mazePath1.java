//                                      maze path (1-jump row-column-diagonal) by post order 
import java.util.ArrayList;
public class mazePath1{
    public static void main(String[] args)
    {
       int dr=2;
       int dc=2;
       int sr=0;
       int sc=0;

       System.out.print(maze(sr,sc,dr,dc));
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
        ArrayList<String> diag=maze(sr+1,sc+1,dr,dc);


        ArrayList<String> recans=new ArrayList<>();
        for(String s:vert){
            recans.add("V"+" "+s);
        }
        for(String s:hori){
            recans.add("H"+" "+s);
        }   
        for(String s:diag){
            recans.add("D"+" "+s);
        }   
        return recans;
    }
}