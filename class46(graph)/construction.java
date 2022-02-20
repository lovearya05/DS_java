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
            {1,2,2},
            {3,2,0},
            {2,4,3},
            {4,5,6},
            {4,6,2},
            {5,6,3}
        };

        int vertices = 7;
        make(edges,vertices);

        displayGraph();
        
        System.out.println("---------------------------");
        removeEdge(1,2);
        
        displayGraph();
        
    }

    static void removeEdge(int u,int v){
        int ct = -1;
        for(int i=0;i<graph.get(u).size();i++){
            ct++;
            if(graph.get(u).get(i).v==v){
                graph.get(u).remove(ct);
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

        // displayGraph();
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
