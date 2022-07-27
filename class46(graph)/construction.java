import java.util.ArrayList;

// class 46,47,48,49,50

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
            {5,6,3},
            // {1,5,3}
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
        boolean[] visit = new boolean[graph.size()];

        // depth first search to trvarse A graph
        // dfs(0,visited,"0==>");

        ///DFS from starting vertex to destination vertex
        // dfsSvToDv(0,5,visited,"0==>");

        //checking is there any cycle in the graph
        // System.out.println(findCycle(0, -1,visit, visited));

        //cycle in disconnected Graph
            //graph.get i all nodes ke liye call lagayege
            // ager boolen wale me not visited hai to 

        // cycleInDisconnected(visited);

        // hamitoniumPath(5,1,visited,"5");
        
        // (starting , source, count, visited, ans)
        // hamitoniumCycle(1,1, 1, visited, "1");

        // masterGcc();

        bfs(1);

    }

    static void bfs(int srv){

        boolean[] visited = new boolean[graph.size()];

        ArrayList<Integer> q=new ArrayList<>();
        q.add(srv);
        int lev = 0;

        while(q.size()!=0){

            int sz=q.size();
            System.out.print(lev+"==>");

            while(sz--!=0){

                int rm = q.remove(0);
    
                if(visited[rm]){
                    // System.out.print("cycle....");
                    continue;
                }
    
                visited[rm] = true;
    
                System.out.print(rm+" ");
    
                for(edge nbr : graph.get(rm)){
                    if(!visited[nbr.v]){
                        q.add(nbr.v);
                    }
                }
            }

            System.out.println();
            lev++;

        }
    }

    static void masterGcc(){

        boolean[] visited = new boolean[graph.size()];

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        int count=0;
        for(int i=0;i<graph.size();i++){
            if(!visited[i]){
                count++;
                ArrayList<Integer> ans = gcc(i, visited);
                result.add(ans);
                System.out.println(count);
            }
        }

        System.out.println(result);

    }

    static ArrayList<Integer> gcc(int sc,boolean[] visited){
        
        
        visited[sc] = true;

        ArrayList<Integer> ans =new ArrayList<>();
        ans.add(sc);

        for(edge nbr:graph.get(sc)){
            if(!visited[nbr.v]){
                ArrayList<Integer> res = gcc(nbr.v, visited);
                ans.addAll(res);
            }
        }

        return ans;

    }

    static void hamitoniumCycle(int st,int sc,int count,boolean[] visited,String ans){
        if(count==graph.size()){

            ArrayList<edge> ed = graph.get(sc);

            for(edge i:ed){

                if(i.v==st){
                    System.out.println(ans+"*");
                    return;
                }
            }
            System.out.println(ans);
            return;
        }

        visited[sc] = true;

        ArrayList<edge> ed = graph.get(sc);
        for(edge i:ed){
            if(!visited[i.v]){
                hamitoniumCycle(st,i.v, count+1, visited, ans+"==>"+i.v);
            }
            
        }
        visited[sc]=false;
    }
    
    static void hamitoniumPath(int sc,int count,boolean[] visited,String ans){
        if(count==graph.size()){
            System.out.println(ans);
            return;
        }

        visited[sc] = true;

        ArrayList<edge> ed = graph.get(sc);
        for(edge i:ed){
            if(!visited[i.v]){
                hamitoniumPath(i.v, count+1, visited, ans+"==>"+i.v);
            }
            
        }
        visited[sc]=false;
    }

    static void cycleInDisconnected(boolean[] visited){
        boolean flag = false;
        for(int i=0;i<graph.size();i++){
            if(!visited[i] && !flag){
                
                flag = findCycle(i, -1 , visited);
            }

        }
        System.out.println(flag);
    }

    static boolean findCycle(int cv,int pv, boolean[] visited){

        visited[cv]=true;
        // visit[cv] = true;

        boolean flag=false;

        for(edge ed:graph.get(cv)){

            if(visited[ed.v] && ed.v!=pv){
                return true;
            }

            if(!visited[ed.v]){
                // System.out.println(flag=flag);
                flag=flag || findCycle(ed.v,cv,visited);
            }
        }
        // visited[cv]=false;

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
