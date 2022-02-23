import java.util.ArrayList;

public class construction {

    static class edge{
        int v;
        int w;

        edge(int v,int w){
            this.v=v;
            this.w=w;
        }

        edge(){}
    }

    static ArrayList<ArrayList<edge>> graph;

    public static void main(String[] args) {
        int[][] edges={
            {0,1,6},
            {0,3,5},
            // {1,2,2},
            {3,2,0},
            // {2,4,3},
            {4,5,6},
            {4,6,2},
            {5,6,3}
        };

        int vertices = 7;
        make(edges,vertices);

        ques();


        
    }

    static void ques(){
        // displayGraph();
        
        // System.out.println("---------------------------");
        
        // removeEdge(1,2);
        
        // removeVertex(2);
        // displayGraph();

        boolean[] visited = new boolean[graph.size()];
        // dfs(0,visited,"0==>");
        // dfsSvToDv(0,5,visited,"0==>");

        // System.out.println(findCycle(0, -1, visited));

        //cycle in disconnected Graph

        // for(ArrayList ed:graph){
            //graph.get i all nodes ke liye call lagayege
            // ager boolen wale me not visited hai to 
        // }

        boolean[] visit = new boolean[graph.size()];
        cycleInDisconnected(visit, visited);

    }

    static void cycleInDisconnected(boolean[] visit,boolean[] visited){
        for(int i=0;i<graph.size();i++){
            if(!visit[i]){
                System.out.println(findCycle(i, -1 ,visit, visited));
            }
        }
    }

    static boolean findCycle(int cv,int pv,boolean[] visit, boolean[] visited){

        visited[cv]=true;
        visit[cv] = true;

        boolean flag=false;

        for(edge ed:graph.get(cv)){

            if(visited[ed.v] && ed.v!=pv){
                return true;
            }

            if(!visited[ed.v]){
                // System.out.println(flag=flag);
                flag=flag || findCycle(ed.v,cv,visit,visited);
            }
        }

        visited[cv]=false;

        return flag;

    }

    static void dfs(int cv,boolean[] visited,String psf){
        visited[cv] = true;

        boolean flag=false;

        for(edge ed:graph.get(cv)){
            if(!visited[ed.v]){
                flag=true;
                dfs(ed.v,visited,psf+ed.v+"==>");
            }
        }

        if(!flag){
            System.out.println(psf);
        }

        visited[cv] = false;

    }
    static void dfsSvToDv(int cv,int dv,boolean[] visited,String psf){
        visited[cv] = true;


        for(edge ed:graph.get(cv)){

            if(ed.v==dv){
                System.out.println(psf+dv);
            }else  if(!visited[ed.v]){
                dfsSvToDv(ed.v,dv,visited,psf+ed.v+"==>");
            }
        }

        visited[cv] = false;

    }

    static void removeVertex(int ver){
        ArrayList<edge> edges=graph.get(ver);
        for(edge ed:edges){
            ArrayList<edge> rmed = graph.get(ed.v);
            for(int i=0;i<rmed.size();i++){
                if(ver==rmed.get(i).v){
                    rmed.remove(i);
                    break;
                }
            }
        }

        graph.set(ver, new ArrayList<edge>());
    }

    static void removeEdge(int u,int v){
        for(int i=0;i<graph.get(u).size();i++){
            if(graph.get(u).get(i).v==v){
                graph.get(u).remove(i);
                break;
            }
        }
        for(int i=0;i<graph.get(v).size();i++){
            if(graph.get(v).get(i).v==u){
                graph.get(v).remove(i);
                break;
            }
        }
        
    }

    static void make(int[][] edges,int vertices){

        graph = new ArrayList<>();
        for(int i=0;i<vertices;i++){
            graph.add(new ArrayList<edge>());
        }

        for(int[] arr:edges){
            addEdge(arr[0],arr[1],arr[2]);
        }

    }

    static void addEdge(int u,int v,int w){

        graph.get(u).add(new edge(v,w));
        graph.get(v).add(new edge(u,w));
    }

    static void displayGraph(){

        for(int i=0;i<graph.size();i++){
            System.out.print(i+"==>");

            for(edge ed:graph.get(i)){
                System.out.print("["+ed.v+", w-"+ed.w+" ] ;");
            }
            System.out.println();

        }
    }

}
