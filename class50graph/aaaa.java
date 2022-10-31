import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class construct{

  static class pair{
      int v;
      int wt;

    pair(){

    }

    pair(int v,int wt){
        this.v=v;
        this.wt=wt;
    }

  }

  static ArrayList<ArrayList<pair>> graph;

  static void make(int n,int[][] edges){
 
    graph=new ArrayList<>();
   
   for(int i=0;i<n;i++){
      graph.add(new ArrayList<pair>());
   }

   for(int i=0;i<edges.length;i++){
       addedge(edges[i][0],edges[i][1],edges[i][2]);
   }


  }

  static void addedge(int u,int v,int wt){
      
      graph.get(u).add(new pair(v,wt));
      graph.get(v).add(new pair(u,wt));

  }


  static void addedgeGenric(ArrayList<ArrayList<pair>> graph,int u,int v,int wt){
      
    graph.get(u).add(new pair(v,wt));
    graph.get(v).add(new pair(u,wt));

}


  static void display(){
      for(int i=0;i<graph.size();i++){
          System.out.print(i+"==>");

         for(pair ed:graph.get(i)){
             System.out.print(ed.v+"-"+ed.wt+", ");
         }

         System.out.println();

      }
  }

  static void displayGenric(ArrayList<ArrayList<pair>> graph){
    for(int i=0;i<graph.size();i++){
        System.out.print(i+"==>");

       for(pair ed:graph.get(i)){
           System.out.print(ed.v+"-"+ed.wt+", ");
       }

       System.out.println();

    }
}

  public static void main(String[] args){

    int n=7;// number of vertex
    //number of edges
    int[][] arr={
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
    // int[][] arr={
    //     {0,1,2},
    //     {0,3,2},
    //     {1,2,3},
    //     {2,3,4},
    //     // {3,4,1},
    //     // {4,7,5},
    //     {4,5,2},
    //     // {5,6,6},
    //     {7,6,3},
    //     // {2,7,90}
    // };
    make(n,arr);
    question();
    
  }
  
  static void question(){
 
      // ============================> Construction <=======================
      // display();
      // remedge(2,3);      
      // remedge(3,2);  
      // System.out.println("=========================");
      // display();
      
      // remvertex(2);

      // ============================> DFS <=======================
      // int sr=1;
      // boolean[] visited=new boolean[graph.size()];
      // dfs(sr,visited,""+sr);
      // int dt=6;
      // findDest(sr,dt,visited,"");
      
      // int sr=0;
      // if(cycle(sr,visited,-1)){
      //   System.out.println("Cycle found");
      // }else{
      //   System.out.println("Cycle not found");
      // }

      // gccMain();
      // friendMain();
      // if(isconnneted()){
      //   System.out.println("graph is connected");
      // }else{
      //   System.out.println("graph is not connected");
      // }

      // if(iscylic()){
      //    System.out.println("Cycle found in graph");
      //   }else{
      //     System.out.println("Cycle not found in graph");

      // }

      // ============================> BFS <=======================
      
      // int src=1;
      // //   // bfs(); 
      // //   bfs2(src);
      // if(cycle(src)){
      //   System.out.println("Cycle found using BFS");
      // }else{
      //   System.out.println("Cycle not found using BFS");

      // }

      // gccMainBFS();

      // ============================> BFS <=======================

      // ArrayList<ArrayList<pairs>> graphDijk;
      int n=7;
      graphDijk=new ArrayList<>();
       
      for(int i=0;i<n;i++){
        graphDijk.add(new ArrayList<pair>());
      }

      dijkstra();
           
  }

  static class pairs implements Comparable<pairs>{
    int vt;
    int pt;
    int wt;
    int wsf;

    pairs(int vt,int pt,int wt,int wsf){
      this.vt=vt;
      this.pt=pt;
      this.wt=wt;
      this.wsf=wsf;
    }

    public int compareTo(pairs o){
      return this.wt-o.wt;
    }
  }

  static ArrayList<ArrayList<pair>> graphDijk;


  static void dijkstra(){

    int sr=2;
    // display();

    PriorityQueue<pairs> pq=new PriorityQueue<>();
    pq.add(new pairs(sr, -1, 0, 0));

    boolean[] visited=new boolean[graph.size()];

    while(pq.size()>0){

      pairs rm = pq.remove();

      if(visited[rm.vt]){
        continue;
      }

      if(rm.pt!=-1){
        addedgeGenric(graphDijk,rm.vt,rm.pt,rm.wt);
      }

      visited[rm.vt]=true;
      for(pair p: graph.get(rm.vt)){
        if(!visited[p.v]){
          pq.add(new pairs(p.v, rm.vt, p.wt, rm.wsf+p.wt));
        }
      }


    }

    display();
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
    displayGenric(graphDijk);

  }

  static void gccMainBFS(){

    int n=graph.size();
    boolean[] visited=new boolean[n];

    int count=0;
    for(int i=0;i<n;i++){

      if(!visited[i]){
        gccBFS(i,visited);
        count++;
        // System.out.println();
      }

    }

    System.out.println("Total number of gcc in graph => "+count);

  }

  static void gccBFS(int src,boolean[] vis){
   
    Queue<Integer> q=new LinkedList<>();
    
    q.add(src);

    while(q.size()>0){

      int sz=q.size();

      while(sz--!=0){

        int rem=q.remove();

        if(vis[rem]){
          continue;
        }

        // System.out.print(rem+" ");
        
        vis[rem]=true;

        for(pair nbr:graph.get(rem)){

          if(!vis[nbr.v]){
            q.add(nbr.v);
          }
        }



      }

    }


  }

  static boolean cycle(int src){

    int n=graph.size();
    Queue<Integer> q=new LinkedList<>();
    boolean[] vis=new boolean[n];
    
    q.add(src);

    while(q.size()>0){

      int sz=q.size();

      while(sz--!=0){

        int rem=q.remove();

        if(vis[rem]){
          return true;
        }

        
        vis[rem]=true;

        for(pair nbr:graph.get(rem)){

          if(!vis[nbr.v]){
            q.add(nbr.v);
          }
        }



      }


    }

    return false;
    



  }

  static void bfs2(int src){

    int n=graph.size();
    Queue<Integer> q=new LinkedList<>();
    boolean[] vis=new boolean[n];
    
    q.add(src);

    while(q.size()>0){

      int sz=q.size();

      while(sz--!=0){

        int rem=q.remove();

        if(vis[rem]){
          continue;
        }

        System.out.print(rem+" ");
        
        vis[rem]=true;

        for(pair nbr:graph.get(rem)){

          if(!vis[nbr.v]){
            q.add(nbr.v);
          }
        }



      }

      System.out.println();

    }
    



  }

  static void bfs(){

    int n=graph.size();
    Queue<Integer> q=new LinkedList<>();
    boolean[] vis=new boolean[n];

    int src=0;
    q.add(src);
    vis[src]=true;

    while(q.size()>0){

      int sz=q.size();
      
      while(sz--!=0){

        int rem=q.remove();

        System.out.print(rem+" "); 

        for(pair nbr:graph.get(rem)){
          if(!vis[nbr.v]){
            q.add(nbr.v);
            vis[nbr.v]=true;
          }
        }
      }

      System.out.println();


    }



  }

  static boolean iscylic(){

    int n=graph.size();
    boolean[] vis=new boolean[n];
    // comment the vis[sr]=false;
    for(int i=0;i<n;i++){
      if(!vis[i]){
         if(cycle(i,vis,-1)){
           return true;
         }
      }
    }

    return false;

  }

  static boolean isconnneted(){

    boolean[] vis=new boolean[graph.size()];
    int count=0;
    for(int i=0;i<graph.size();i++){

      if(!vis[i]){
        gcc(i,vis);
        count++;
        if(count>1){
          return false;
        }
      }

    }

    return true;

  }

  static void friendMain(){

    boolean[] vis=new boolean[graph.size()];
    ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
    for(int i=0;i<graph.size();i++){
      if(!vis[i]){
        ArrayList<Integer> str=new ArrayList<>();
        friend(i,vis,str);
        ans.add(str);
      }
    }

    System.out.println("total number of group "+ans.size());
    
    int tong=1;//total num of new group
    
    for(ArrayList<Integer> arr:ans){
 
      tong*=arr.size();
    }
    
    System.out.println("total number of new group "+tong);



  }

  static void friend(int src,boolean[] vis,ArrayList<Integer> str){

    vis[src]=true;
    str.add(src);

    for(pair nbr:graph.get(src)){
      if(!vis[nbr.v]){
        friend(nbr.v,vis,str);
      }
    }

  }

  static void gccMain(){

    boolean[] vis=new boolean[graph.size()];
    for(int i=0;i<graph.size();i++){
      if(!vis[i]){
        gcc(i,vis);
        System.out.println();
      }
    }

  }

  static void gcc(int src,boolean[] vis){

    vis[src]=true;
    // System.out.print(src+" ");

    for(pair nbr:graph.get(src)){
      if(!vis[nbr.v]){
        gcc(nbr.v,vis);
      }
    }

  }

  static boolean cycle(int sr,boolean[] visited,int pt){


    visited[sr]=true;


    boolean flag=false;

    for(pair nbr:graph.get(sr)){

      if(nbr.v!=pt && visited[nbr.v]){
        return true;
      }

      if(!visited[nbr.v]){
        flag=flag || cycle(nbr.v,visited,sr);
      }

    }

    visited[sr]=false;

    return flag;


  }

  static void dfs(int sr,boolean[] visited,String psf){//path so far
    
    visited[sr]=true;
    
    boolean flag=false;

    for(pair nbr:graph.get(sr)){
      if(!visited[nbr.v]){
        flag=!flag?true:flag;
        dfs(nbr.v,visited,psf+nbr.v);
      }
    }

    if(!flag){
      System.out.println(psf);
    }
    
    visited[sr]=false;
  }

  static void findDest(int sr,int dt,boolean[] visited,String psf){
       psf+=sr;
       
       if(sr==dt){
         System.out.println(psf);
         return;
       }

       visited[sr]=true;
       
       for(pair nbr:graph.get(sr)){
         if(!visited[nbr.v]){
           findDest(nbr.v,dt,visited,psf);
        }
      }
      
      visited[sr]=false;


  }

  static void remedge(int u,int v){


     for(pair ed:graph.get(u)){
      
      if(ed.v==v){
         graph.get(u).remove(ed);
         break;
      }

     }


   




  }

  static void remvertex(int ver){


    for(pair ed:graph.get(ver)){
      
      remedge(ed.v,ver);
    
    }

    graph.remove(ver);


  }

}