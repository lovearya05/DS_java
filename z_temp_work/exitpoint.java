import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
public class exitpoint {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter no of rows");
        // int r = sc.nextInt();
        // System.out.println("enter no of Cols");
        // int c = sc.nextInt();
        // int[][] arr = new int[r][c];
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }

        // for(int i=0;i<r;i++){
        //     System.out.println(Arrays.toString(arr[i]));
        // }

        // int[][] arr = {
        //     {0,0,0,1},
        //     {1,0,0,0},
        //     {0,0,1,0},
        //     {1,0,0,1}
        // };
        // exitPoint(arr);
        // int ans = pow(2,3);
        // System.out.println(ans);

        //recursion
        // toh(3,"sr","hp","dt");
        // subs("abc");
        // int[] arr = {1,23,4,5,6,7,8,1,3,4};
        // int ans = indexOfNoFromStarting(arr,0,1);
        // int ans = indexOfNoFromBack(arr,0,1);
        // System.out.println(ans);
        // int ans = maxNoInArray(arr,0);
        // System.out.println(ans);
        // int ans = noOfOcc(arr,0,1);
        // System.out.println(ans);
        // int[][] arr = {
        //     {11,12,13,14},
        //     {21,22,23,24},
        //     {31,32,33,34},
        //     {41,42,43,44}
        // };
        // searchIn2DArray(arr,103);
        // int[] arr  = {1,2,1,3,2,4,2,1,8,9};
        // noOfOccAndIndex(arr);
        // LinkedList();

        // histogramArea();
        

    }

    static void histogramArea(){
        int[] arr = {6,2,5,4,5,1,6};

        int ans = Integer.MIN_VALUE;
        int[] nse = new int[arr.length];
        int[] pse = new int[arr.length];

        nextSmallEle(arr,nse);
        prevSmallEle(arr,pse);

        for(int i=0;i<arr.length;i++){
            ans = Math.max(ans, (nse[i]-pse[i]-1)*arr[i]);
        }

        System.out.println(ans);
    }

    
    static void prevSmallEle(int[] arr,int[] pse){
        Stack<Integer> st = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                pse[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(st.size()>0){
            pse[st.pop()] = -1;
        }
        // System.out.println(Arrays.toString(pse));
    }
    static void nextSmallEle(int[] arr, int[] nse){
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<arr.length;i++){
           
            while(st.size()>0 && arr[st.peek()]>arr[i]){
                nse[st.pop()] = arr[i];
            }
        
            st.push(i);
        }

        while(st.size()>0){
            nse[st.pop()] = -1;
        }

        // System.out.println(Arrays.toString(nse));

    }

    static void LinkedList(){
        // node head;
        // addLast(10);     
        // addLast(20);     
        // addLast(30);     
        // addLast(40);     
        // addLast(50);
        // adedFront(6);  
        // adedFront(5);  
        // adedFront(4);  
        // adedFront(3);  
        // adedFront(2);  
        // displayLL(head);

        node<Integer> ll = new node<>();
        ll.addFront(10);
        ll.addFront(9);
        ll.addFront(8);
        ll.addFront(7);
        // ll.display();
        ll.addLast(11);
        ll.addLast(12);
        ll.addLast(13);
        ll.display();
    }

    
    
    static class node<E>{
        private class Node{
            Node next;
            E data;

            Node(E val){
                this.data = val;
            }
            Node(){};
        }
        private Node head;

        void addLast(E val){
            if(head==null){
                head = new Node(val);
            }else{
                Node iter = head;
                while(iter.next!=null){
                    iter = iter.next;
                }
                iter.next = new Node(val);
            }
        }

        void display(){
            Node iter = head;
            while(iter!=null){
                System.out.print(iter.data +"-> ");
                iter = iter.next;
            }
        }

        void addFront(E val){
            if(head==null){
                head = new Node(val);
            }else{
                Node nd = new Node(val);
                nd.next = head;
                head = nd;
            }
        }

        // static void displayLL(node iter){
        //     while(iter!=null){
        //         System.out.print(iter.data + "-> ");
        //         iter = iter.next;
        //     }
        // }
        // static node head;
        // static void addLast(int val){
        //     if(head==null){
        //         head = new node(val);
        //     }else{
        //         node nd = new node(val);
        //         node iter = head;
        //         while(iter.next!=null){
        //             iter = iter.next;
        //         }
        //         iter.next = nd;
        //     }
        // }
    }
    static void noOfOccAndIndex(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int val:arr){
            hm.put(val, hm.getOrDefault(val,0)+1);
        }

        for(int val : hm.keySet()){
            System.out.println(val+" "+ hm.get(val));
        }
    }
    static void searchIn2DArray(int[][] arr,int val){
        int i=0;
        int j= arr[0].length-1;
        while(true){
            if(i>=arr.length || j<0){
                System.out.println("Element is not present");
                break;
            }
            if(arr[i][j]==val){
                System.out.print(i+" "+j);
                break;
            }else if(arr[i][j]<val){
                i++;
            }else if(arr[i][j]>val){
                j--;
            }
        }
    }
    static int noOfOcc(int[]arr,int i, int val){
        if(i==arr.length) return 0;
        int ans = noOfOcc(arr, i+1, val);
        if(arr[i]==val) return ans+1;
        return ans;
    }
    static int maxNoInArray(int[]arr,int i){
        if(i==arr.length) return -1;
        int ans = maxNoInArray(arr, i+1);
        if(arr[i]>ans) return arr[i];
        return ans;
    }
    static int indexOfNoFromBack(int[]arr,int idx,int temp){
        if(idx==arr.length) return -1;
        int ans = indexOfNoFromBack(arr, idx+1, temp);
        if(arr[idx]==temp && idx>ans)return idx;
        return ans;
    }
    static int indexOfNoFromStarting(int[] arr, int idx, int temp){
        if(idx==arr.length){
            return -1;
        }

        if(arr[idx]==temp) return idx;
        return indexOfNoFromStarting(arr, idx+1, temp);
    }
    static void subs(String str){

    }
    static void toh(int n,String sr,String hp, String dt){
        if(n==0) return;
        toh(n-1, sr, dt, hp);
        System.out.println(n+" " +sr+" "+ dt);
        toh(n-1,hp,sr,dt);

    }
    static int pow(int n, int p){
        if(p==0) return 1;
        int ans = pow(n,p/2);
        if(p%2==0) return ans*ans;
        else return n*ans*ans;
    }

    static void exitPoint(int[][] arr){
        int r=0;
        int c=0;
        int d=0;

        boolean flag = true;

        while(flag){
            
            d+=arr[r][c];
            d=d%4;
            if(d==0) c++;
            else if(d==1) r++;
            else if(d==2) c--;
            else if(d==3) r--;

            if(r<0 || r>=arr.length || c<0 || c>=arr[0].length){
                System.out.println(r + " " + c);
                flag = false;
            }
        }
    }
    
    
}
