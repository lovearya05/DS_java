public class morris {
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
        int[] arr={12,25,30,35,37,40,50,60,62,70,75,87};
        construct(arr, 0, arr.length-1);
        // display(root);
        
        MoorisTraversal();
    }
    static void MoorisTraversal(){


        TreeNode curr=root;
        // prev

        while(curr!=null){

            if(curr.left==null){

                System.out.print(curr.val+" ");
                curr=curr.right;

            }else{

                TreeNode temp=curr.left;

                while(temp.right!=null && temp.right!=curr){
                    temp=temp.right;
                }

                if(temp.right==null){
                    temp.right=curr;
                    System.out.print(curr.val+" ");//Pre order

                    // if(){

                    // }else{
                    //     if(prev<curr.val){
                    //         prev=curr;
                    //     }else{
                    //         return false;
                    //     }
                    // }
                    curr=curr.left;
                    
                }else{
                    temp.right=null;
                    // System.out.print(curr.val+" ");//In order
                    curr=curr.right;
                }
            }
        }
    }

    static TreeNode construct(int[] arr, int l, int r){
        if(l>r) return null;

        // int mid = l-(r-l)/2;
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
