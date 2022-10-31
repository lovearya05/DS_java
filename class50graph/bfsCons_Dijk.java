import java.util.ArrayList;
import java.util.PriorityQueue;


public class bfsCons_Dijk{

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

    public static void main(String[] args){
        // int[][] edges={
        //     {0,1,6},
        //     {0,3,5},
        //     {1,2,2},
        //     // {3,2,0},
        //     {2,4,3},
        //     {4,5,6},
        //     // {4,6,2},
        //     {5,6,3},
        //     // {1,5,3}
        // };

        // int vertices = 7;
        // make(edges,vertices);

        // ques();

        // Dijakastra's algo
        int[][] arr = {
            {0,1,10},
            {0,3,10},
            {1,2,10},
            {2,3,40},
            {3,4,2},
            // {4,7,5},
            {4,5,3},
            {5,6,4},
            {4,6,8},
            // {7,6,3},
            // {2,7,90}
        };

        int n=7;
        make(n,arr);
        dijkstra(n);
        // displayGenric(graph);

    }

    static void make(int n,int[][] edges){
        graph=new ArrayList<>();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<edge>());
        }

        for(int i=0;i<edges.length;i++){
            addEdge(edges[i][0],edges[i][1],edges[i][2]);
        }
    }

    static void dijk(){
        int sr = 2;

        PriorityQueue<pair> pq = new PriorityQueue<>();

        pq.add(new pair(sr,-1,0,0));
        boolean[] visited = new boolean[graph.size()];

        while(pq.size()>0){
            pair rm = pq.remove();

            if(visited[rm.vt]) continue;

            if(rm.pt!=-1){
                addEdgeGenric(graphDijk,rm.vt,rm.pt,rm.wt);
            }

            visited[rm.vt] = true;

            for(edge ed:graph.get(rm.vt)){
                if(!visited[ed.v]){
                    pq.add(new pair(ed.v,rm.vt,ed.w,rm.wsf+ed.w));
                }
            }
        }

        displayGraph();
        System.out.println("-----------------------");
        displayGenric(graphDijk);
    }

    static void displayGenric(ArrayList<ArrayList<edge>> graph){
        for(int i=0;i<graph.size();i++){
            System.out.print(i+"==>");
            for(edge ed:graph.get(i)){
                System.out.print(ed.v+"-"+ed.w+", ");
            }
            System.out.println();
        }
    }

    static void addEdgeGenric(ArrayList<ArrayList<edge>> graph,int u,int v,int wt){
        graph.get(v).add(new edge(u,wt));
        graph.get(u).add(new edge(v,wt));
    }

    static class pair implements Comparable<pair>{
        int vt; //vert
        int pt; //parent
        int wt; //weight
        int wsf; // weight so far

        pair(int vt,int pt,int wt,int wsf){
            this.vt = vt;
            this.pt = pt;
            this.wt = wt;
            this.wsf = wsf;
        }

        public int compareTo(pair o){
            return this.wt-o.wt; //Dijkastra
            // return this.wt-o.wt; //prims;
        }
    }
    static ArrayList<ArrayList<edge>> graphDijk;

    static void dijkstra(int n){
        graphDijk = new ArrayList<>();
        for(int i=0;i<n;i++){
            graphDijk.add(new ArrayList<edge>());
        }
        dijk();
    }

    static void ques(){
        
        // bfs(1);
        // displayGraph();
        // bipartite();

    }
    
        static void bfs(int srv) {
    
            ArrayList<Integer> q = new ArrayList<>();
    
            q.add(srv);
            boolean[] visited = new boolean[graph.size()];
    
            int lev=0;
            // g r m p a
            while (q.size() != 0) {
    
                int sz = q.size();
    
                System.out.print(lev+" => ");
                // level wise iteration
                while (sz-- != 0) {
    
                    int rm = q.remove(0);
    
                    if (visited[rm]) {
                        // System.out.println("cycle......");
                        continue;
                    }
    
                    visited[rm] = true;
    
                    System.out.print(rm + " ");
    
                    for (edge nbr : graph.get(rm)) {
                        if(!visited[nbr.v]){
                            q.add(nbr.v);
                        }
                    }
                }
    
                System.out.println();
                lev++;
    
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

    
    static void bipartite() {
        
        ArrayList<Integer> q = new ArrayList<>();

        q.add(1);
        int[] visited = new int[graph.size()];

        int lev=0;

        int col=1;
        // g r m p a
        while (q.size() != 0) {

            int sz = q.size();
            // level wise iteration
            while (sz-- != 0) {

                int rm = q.remove(0);

                if (visited[rm]!=0) {
                    if(visited[rm]!=col){
                        System.out.println("not possilbe to bipartite");
                        return;
                    }
                    continue;
                }

                visited[rm] = col;

                for (edge nbr : graph.get(rm)) {
                    if(visited[nbr.v]==0){
                        q.add(nbr.v);
                    }
                }
            }

       
            lev++;

            col=(col%2)+1;

        }

        for(int i=0;i<visited.length;i++){
            if(visited[i]==1){
                System.out.print(i+" ");
            }
        }
        System.out.println("\n========================");
        for(int i=0;i<visited.length;i++){
            if(visited[i]==2){
                System.out.print(i+" ");
            }
        }

        System.out.println("\nBipartite is possible");

    }


}