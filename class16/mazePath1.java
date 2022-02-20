//                                 Maze path when multiple shifting allowed
public class mazePath1{
    public static void main(String[] args)
    {
        int sr=0;
        int sc=0;

        int dr=2;
        int dc=2;

        PrintMaze(sr,sc,dr,dc,"");
    }
public static void PrintMaze(int sr,int sc,int dr,int dc,String ans) {
    //if(sr>dr || sc>dc) return;
    
    if(sr==dr && sc==dc){
        System.out.println(ans);
        return;
    }
    for(int i=1;i<=dr;i++){
        
        if(sr+i<=dr && sc<=dc)
        PrintMaze(sr+i,sc,dr,dc,ans+"v-"+i+"  ");
    }
     for(int i=1;i<=dc;i++){
        if(sr+i<=dr && sc+i<=dc)
        PrintMaze(sr+i,sc+i,dr,dc,ans+"D-"+i+"  ");
    }

    for(int i=1;i<=dc;i++){
        if(sc+i<=dc && sr<=dr)
        PrintMaze(sr,sc+i,dr,dc,ans+"H-"+i+"  ");

    }
    
}

}