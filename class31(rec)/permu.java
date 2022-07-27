// queen with n boxes

public class permu {
    public static void main(String[] args) {
        quen();
    }
    static void quen(){
        int box=15;
        int qu=4;
        // boolean[] visited=new boolean[box];
        // int count=permutation(box,1,visited,"");
        // System.out.println(count);

        
        // boolean[] visited=new boolean[box+1];
        // int count=combination(box,qu,1,1,visited,"");
        // System.out.println(count);
        
        
        boolean[] visited=new boolean[box+1];
        int count=nqueen(box,qu,1,1,visited,"");
        System.out.println(count);

    }
    static int permutation(int box,int count,boolean[] visited,String asf){
        if(count>box){
            System.out.println(asf);
            return 1;
        }
        int tcount=0;

        for(int i=1;i<=box;i++){
            if(visited[i-1]==false){
                visited[i-1]=true;
                tcount+=permutation(box, count+1, visited, asf+"B"+count+"Q"+i+" ");
                visited[i-1]=false;
            }
        }
        return tcount;

    }
    static int combination(int box,int qu,int count,int in,boolean[] visited,String asf){
        if(count>qu){
            System.out.println(asf);
            return 1;
        }
        int tcount=0;

        for(int i=in;i<=box;i++){
            if(visited[i-1]==false){
                visited[i-1]=true;
                tcount+=combination(box,qu, count+1,i, visited, asf+"B"+i+"Q"+count+"==");
                visited[i-1]=false;
            }
        }
        return tcount;

    }
    static int nqueen(int box,int qu,int count,int in,boolean[] visited,String asf){
        if(count>qu){
            System.out.println(asf.substring(0,asf.length()-2));
            return 1;
        }

        int tcount=0;

        for(int i=in;i<=box;i++){ //queen
            if(visited[i]==false && issafe(i,visited,qu)){
                visited[i]=true;
                tcount+=nqueen(box,qu, count+1,i, visited, asf+"B"+i+"Q"+count+"==");
                visited[i]=false;
            }
        }
        return tcount;

    }


    static boolean issafe(int idxt,boolean[] visited,int qu){
        int r=idxt/qu;
        int c=idxt%qu;

        // r and c we are using for finding the row and col idx for 2D array

        //upper
        for(int i=r-1;i>=0;i--){
            int idx=qu*i+c;
            if(visited[idx]) return false;
        }
        //left

        for(int j=c-1;j>=0;j--){
            int idx=qu*r+j;
            if(visited[idx]) return false;
        }

        //upper left diagonal

        for(int i=r-1,j=c-1;i>=0 && j>=0;i--,j--){
            int idx=qu*i+j;
            if(visited[idx]) return false;
        }

        //upper right diagonal

        for(int i=r-1,j=c+1;i>=0 && j<=qu-1;i--,j++){
            int idx=qu*i+j;
            if(visited[idx]) return false;
        }

        return true;


    }

}
