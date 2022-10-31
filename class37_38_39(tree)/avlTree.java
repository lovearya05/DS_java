public class avlTree {
    public static class Node{
        int data = 0;
        Node left = null;
        Node right = null;

        int height = 0;
        int bal = 0;

        public Node(int data){
            this.data = data;
        }
        public Node(){}
    }

    public static void display(Node node){
        if(node==null) return;

        String st = "";
         st += node.left!=null?node.left.data:" . ";
         st += "<- " +node.data + " ->";
         st += node.right!=null?node.right.data:" . ";

         System.out.println(st);

         display(node.left);
         display(node.right);
    }

    public static Node addData(Node root,int data){
         
        if(root==null) return new Node(data);

        if(data<root.data) root.left = addData(root.left, data);
        else if(data>root.data) root.right = addData(root.right, data);

        return getRotation(root);
        // return root;
    }
    
    public static Node removeData(Node node, int data){

        if(data<node.data) node.left = removeData(node.left, data);
        else if(data>node.data) node.right = removeData(node.right, data);
        else if(node.data==data){
            if(node.left==null || node.right==null){
                return node.left!=null ? node.left:node.right; 
            }

            Node maxNode = getMaxNode(node.left);
            node.data = maxNode.data;
            node.left = removeData(node.left, maxNode.data);
            
            return getRotation(node);
        }

        return node;
    }

    static Node getMaxNode(Node node){
        Node curr = node;

        while(curr.right!=null) curr = curr.right;

        return curr;
    }

    public static Node getRotation(Node node){
        updateHeightAndBalance(node);

        if(node.bal==2){ //ll , lr structure

            if(node.left.bal==1){ //ll
                return rightRotation(node);
            }else{ // lr
                node.left = leftRotation(node.left);
                return rightRotation(node);
            }

        }else if(node.bal==-2){ // rr, rl

            if(node.right.bal==-1){ // rr
                return leftRotation(node);
            } else{ // rl
                node.right = rightRotation(node.right);
                return leftRotation(node);
            }
        }

        return node;
    }

    public static Node rightRotation(Node A){
        Node B = A.left;
        Node Bright = B.right;

        B.right = A;
        A.left = Bright;

        updateHeightAndBalance(A);
        updateHeightAndBalance(B);

        return B;
    }

    public static Node leftRotation(Node A){
        Node B = A.right;
        Node Bleft = B.left;

        B.left = A;
        A.right = Bleft;

        updateHeightAndBalance(A);
        updateHeightAndBalance(B);

        return B;
    }

    static void updateHeightAndBalance(Node node){
        int lh = -1;
        int rh = -1;

        if(node.left!=null) lh = node.left.height;
        if(node.right!=null) rh = node.right.height;

        int bal = lh-rh;
        int height = Math.max(lh,rh)+1;

        node.height = height;
        node.bal = bal;
    }
    
    public static void main(String[] args) {
        solve();
    }

    public static void solve(){
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        Node root = null;

        for(int val:arr){
            root = addData(root, val);
        }

        display(root);
        
        removeData(root, 80);
        System.out.println("________________------------_______");

        display(root);
    }
}
