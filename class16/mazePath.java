
public class mazePath{
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
    if(sr+1<=dr)
    PrintMaze(sr+1,sc,dr,dc,ans+"v ");
    if(sc+1<=dc)
    PrintMaze(sr,sc+1,dr,dc,ans+"h ");
}

}