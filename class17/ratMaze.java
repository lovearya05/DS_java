public class ratMaze{
    public static void main(String[] args){
        int sr=0;
        int sc=0;
        int dr=3;
        int dc=3;
        int[][] maze={
            {0,1,0,0},
            {0,0,0,1},
            {0,1,0,1},
            {0,0,0,0},

        };
        boolean[][] visited=new boolean[maze.length][maze[0].length];
        Path(sr,sc,dr,dc,"",maze,visited);

    }

    //Backtracking

    static void Path(int sr,int sc,int dr,int dc,String ans,int[][] maze,boolean[][] visited){

         if(sr==dr && sc==dc){
             System.out.println(ans);
             return;
         }
        visited[sr][sc]=true;
        //LDRU

        //left
        if(issafe(sr,sc-1,dr,dc,maze) && !visited[sr][sc-1]){
            Path(sr,sc-1,dr,dc,ans+"L",maze,visited);
        }
        //down
        if(issafe(sr+1,sc,dr,dc,maze) && !visited[sr+1][sc]){
            Path(sr+1,sc,dr,dc,ans+"D",maze,visited);
        }
        //right
        if(issafe(sr,sc+1,dr,dc,maze) && !visited[sr][sc+1]){
            Path(sr,sc+1,dr,dc,ans+"R",maze,visited);
        }
        //up
        if(issafe(sr-1,sc,dr,dc,maze) && !visited[sr-1][sc]){
            Path(sr-1,sc,dr,dc,ans+"U",maze,visited);
        }

        visited[sr][sc]=false;
    }
    static boolean issafe(int sr,int sc,int dr,int dc,int[][] maze){
        if(sr<0 || sc<0 || sr>=maze.length || sc>=maze[0].length || maze[sr][sc]==1){
            return false;
        }
        return true;
    }

}