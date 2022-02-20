//                                      maze path (n-jump row-column-diagonal) by post order 
import java.util.ArrayList;
public class mazePath2{
    public static void main(String[] args)
    {
       int dr=2;
       int dc=2;
       int sr=0;
       int sc=0;
       int a=1;
       System.out.print(maze(sr,sc,dr,dc,a));
    }  
    public static ArrayList<String> maze(int sr,int sc,int dr,int dc,int a){
        /*if(sr>dr || sc>dc){
            ArrayList<String> nil=new ArrayList<>();
            return nil;
        }*/
        if(sr==dr && sc==dc){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> vert=new ArrayList<>();
        for(int i=a;i<=dr;i++){
            if(sr+i<=dr && sc<=dc)
            vert.addAll(maze(sr+i,sc,dr,dc,i));
        }
        ArrayList<String> hori=new ArrayList<>();
        for(int i=a;i<=dc;i++){
            if(sc+i<=dc && sr<=dr)
            hori.addAll(maze(sr,sc+i,dr,dc,i));
        }
        /*ArrayList<String> diag=new ArrayList<>();
        for(int i=a;i<=dr;i++){
            if(sr+i<=dr && sc+i<=dc)
            diag.addAll(maze(sr+i,sc+i,dr,dc,i));
        }*/
        
        ArrayList<String> recans=new ArrayList<>();

        for(String s:vert){
            recans.add("v"+"-"+a+" "+s);
        }
        for(String s:hori){
            recans.add("h"+"-"+a+" "+s);
        }   
        /*for(String s:diag){
            recans.add("d"+"-"+a+" "+s);
        }   */
        return recans;
    }
}