import java.lang.reflect.Array;
import java.util.ArrayList;
public class graphConstruction {

    static class edge{
        int v;
        int w;

        edge(int v,int w){
            this.v = v;
            this.w = w;
        }
        edge(){}
    }

    static ArrayList<ArrayList<edge>> graph;
    public static void main(String[] args) {
        int[][] edges = {
            {0,1,6},
            {0,3,5},
            {1,2,2},
            {3,2,0},
            {2,4,3},
            {4,5,6},
            {4,6,2},
            {5,6,3},
        };

        int vertices = 7;
        make(edges,vertices);
        que();
    }
    static void que(){
        // displayGraph();
        // System.out.println("****************");
        // removeVertex(1);
        
        removeEdge(1,2);
        removeEdge(2,4);
        // displayGraph();

        boolean[] visited = new boolean[graph.size()];
        // dfs(0,visited,"0==>");
        // bfs(0,visited);
        // dfsSvToDv(0,4,visited,"0==>");

        System.out.println(findCycle(0,-1,visited));



    }

    static boolean findCycle(int srv,int pv,boolean[] visited){

        visited[srv] = true;

        boolean flag = false;

        for(edge ed:graph.get(srv)){
            if(visited[ed.v] && ed.v!=pv){
                return true;
            }
            if(!visited[ed.v]){
                flag=flag || findCycle(ed.v, srv, visited);
            }
        }

        return flag;
    }



    static void dfsSvToDv(int cv,int dv,boolean[] visited,String psf){
        visited[cv] = true;

        for(edge ed:graph.get(cv)){
            if(ed.v==dv){
                System.out.println(psf+dv);
            }else if(!visited[ed.v]){
                dfsSvToDv(ed.v, dv, visited, psf+ed.v+"==>");
            }
        }

        visited[cv] = false;
    }
    

    static void bfs(int srv,boolean[] visited){
        ArrayList<Integer> q = new ArrayList<>();

        q.add(srv);
        int lev = 0;

        while(q.size()>0){
            int sz = q.size();
            System.out.print(lev+"==>");

            while(sz--!=0){
                int rm = q.remove(0);

                if(visited[rm]){
                    continue;
                }

                visited[rm] = true;
                System.out.print(rm+" ");

                for(edge nbr:graph.get(rm)){
                    if(!visited[nbr.v]){
                        q.add(nbr.v);
                    }
                }
            }

            System.out.println();
            lev++;
        }
    }

    static void dfs(int cv,boolean[] visited,String psf){
        visited[cv] = true;

        boolean flag = false;

        for(edge ed:graph.get(cv)){
            if(!visited[ed.v]){
                flag = true;
                dfs(ed.v,visited,psf+ed.v+"==>");
            }
        }
        if(!flag){
            System.out.println(psf);
        }
        visited[cv] = false;

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

    static void removeVertex(int vertex){
        ArrayList<edge> edges = graph.get(vertex);

        for(edge ed:edges){
            ArrayList<edge> rmed = graph.get(ed.v);
            for(int i=0;i<rmed.size();i++){
                if(vertex==rmed.get(i).v){
                    rmed.remove(i);
                    break;
                }
            }
        }

        graph.set(vertex,new ArrayList<edge>());
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
                System.out.print("["+ed.v+", w-"+ed.w+"] ;");
            }
            System.out.println();
        }
    }




}
