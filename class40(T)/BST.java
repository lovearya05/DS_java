public class BST {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            left=null;
            right=null;
        }
    }
    static TreeNode root;

    public static void main(String[] args) {

        ques();
    }
    static void ques(){
        int[] arr={12,25,30,35,37,40,50,60,62,70,75,87};
        construct(arr,0,arr.length-1);
        display(root);
        // int ans=heightBST(root);
        // System.out.println(ans);

    }

    static int heightBST(TreeNode root){
        if(root==null) return 0;

        int a=heightBST(root.left);
        int b=heightBST(root.right);

        if(a>b) return a+1;
        return b+1;
    }

    static TreeNode construct(int[] arr, int l, int r){
        if(l>r) return null;

        // int mid = l+(r-l)/2;
        int mid = (l+r)/2;

        TreeNode node = new TreeNode(arr[mid]);

        if(root==null){
            root=node;
        }

        node.left = construct(arr, l, mid-1);
        node.right = construct(arr, mid+1,r);
        
        return node;
    }

    static void display(TreeNode root){
        if(root==null) return;

        if(root.left!=null){
            System.out.print(root.left.val);
        }else{
            System.out.print(".");
        }

        System.out.print("<=="+root.val+"==>");
        
        if(root.right!=null){
            System.out.print(root.right.val);
        }else{
            System.out.print(".");
        }

        System.out.println();
        
        display(root.left);
        display(root.right);
    }


}
