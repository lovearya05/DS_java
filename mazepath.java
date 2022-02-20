public class mazepath {
    public static void main(String[] args) {
        int sr = 0;
        int sc = 0;

        int dr = 2;
        int dc = 3;


        printPath(sr,sc,dr,dc,"");
    }

    static void printPath(int sr,int sc,int dr,int dc,String ans){

        if(sr>dr || sc>dc) return;

        if(sr==dr && sc==dc){
            System.out.println(ans);
            return;
        }

        for(int i=1;i<=dr;i++){
            printPath(sr+i, sc, dr, dc, ans+"V-"+i+" ");
            
        }
        for(int i=1;i<=dc;i++){
            printPath(sr, sc+i, dr, dc, ans+"H-"+i+" ");
            
        }

        // if(sr+1<=dr) printPath(sr+1, sc, dr, dc, ans+"V ");
        // if(sc+1<=dc) printPath(sr, sc+1, dr, dc, ans+"H ");

    }
}
