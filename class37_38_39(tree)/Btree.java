import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Btree {

    static TreeNode root;

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

    public static void main(String[] args) {
        int[] arr={1,2,4,8,-1,9,15,-1,-1,-1,5,-1,-1,3,6,10,-1,12,13,-1,-1,-1,7,14,-1,-1,-1,-1};

        construct(arr);

        // display(root);
        // System.out.println(rootToNode(root,8));

        // all tree=new all();
        // int ceilOf=5;
        // int floorOf=5;
        // int succOf=2;
        // int precOf=2;
        // que(root,tree,ceilOf,floorOf,precOf,succOf);

        // System.out.println("size of tree : "+tree.size);
        // System.out.println("height of tree : "+tree.height);
        // System.out.println("max val tree : "+tree.max);
        // System.out.println("min val tree : "+tree.min);
        // System.out.println("ceil val tree : "+tree.ceil);
        // System.out.println("floor val tree : "+tree.floor);
        // System.out.println("preceded "+tree.prec);
        // System.out.println("succeeded "+tree.succ);

        // removeLeaf(root);
        // removreLeafbyReturn(root);
        // display(root);
        // lca(root,8,4);
        
        // int[] ans=new int[tree.size];
        // preOrderprt(root,ans);
        // postOrderprt(root,ans);
        // inOrderprt(root,ans);
        // System.out.println(Arrays.toString(ans));

        // maxDiameter(root);
        // System.out.println(max);

        ArrayList<TreeNode> rtn=rootToNode(root,5);

        // for(TreeNode nd:rtn){
        //     System.out.println(nd.val);
        // }

        int k=2;
        for(int i=rtn.size()-1;i>=0 && k>=0;i--){
            TreeNode blocker=i==rtn.size()-1?null:rtn.get(i+1);
            printKdis(rtn.get(i),k,blocker);
            k--;
        }
    }

    static void printKdis(TreeNode root,int k, TreeNode blocker){
        if(root==null) return;

        if(k==0){
            System.out.println(root.val);
            return;
        }

        if(root.left!=blocker){
            printKdis(root.left, k-1, blocker);
        }
        if(root.right!=blocker){
            printKdis(root.right, k-1, blocker);
        }
    }

    static int max=0;
    static int maxDiameter(TreeNode root){
        if(root==null) return 0;

        int a=maxDiameter(root.left);
        int b=maxDiameter(root.right);

        if((a+b+1)>max){
            max=a+b+1;
        }
        if(a>b){
            return a+1;
        }
            return b+1;
        
    }

    static int i=0;
    static void preOrderprt(TreeNode root,int[] ans){
        if(root==null)return;
        ans[i++]=root.val;

        if(root.left!=null){
            preOrderprt(root.left,ans);
        }
        if(root.right!=null){
            preOrderprt(root.right,ans);
        }

    }
    static void postOrderprt(TreeNode root,int[] ans){
        if(root==null)return;
        
        if(root.left!=null){
            postOrderprt(root.left,ans);
        }
        if(root.right!=null){
            postOrderprt(root.right,ans);
        }
        
        ans[i++]=root.val;

    }
    static void inOrderprt(TreeNode root,int[] ans){
        if(root==null)return;
        
        if(root.left!=null){
            inOrderprt(root.left,ans);
        }
        
        ans[i++]=root.val;

        if(root.right!=null){
            inOrderprt(root.right,ans);
        }
    }

    static boolean lca(TreeNode root,int a,int b){
        if(root==null ) return false;

        boolean flag=false;

        if(root.val==a || root.val==b){
            flag=true;
        }

        boolean l_ans=lca(root.left, a, b);
        boolean r_ans=lca(root.right, a, b);

        if((l_ans && r_ans) || (l_ans && flag) || (r_ans && flag)){
            System.out.println(root.val);
            return true;
        }

        if((!l_ans && r_ans) || (!r_ans && l_ans) || ((!r_ans && !l_ans) && flag)) return true;

        return false;

    }

    static TreeNode removreLeafbyReturn(TreeNode root){
        if(root==null || (root.left==null && root.right==null)) return null;

        root.left=removreLeafbyReturn(root.left);
        root.right=removreLeafbyReturn(root.right);

        return root;

    }
    static void removeLeaf(TreeNode root){
        if(root==null) return;

        if(root.left!=null && root.left.left==null && root.left.right==null){
            root.left=null;
        }
        if(root.right!=null && root.right.left==null && root.right.right==null){
            root.right=null;
        }

        if(root.left!=null){
            removeLeaf(root.left);
        }
        if(root.right!=null){
            removeLeaf(root.right);
        }
    }

    static void que(TreeNode root,all tree,int ceilOf,int floorOf,int precOf,int succOf){
        if(root==null) return;


        tree.size++;
        boolean flag=true;

        //max
        if(root.val>tree.max){
            tree.max=root.val;
        }
        //min
        if(root.val<tree.min){
            tree.min=root.val;
        }
        //ceil 
        if(root.val>ceilOf && root.val<tree.ceil){
            tree.ceil=root.val;
        }
        //floor
        if(root.val<floorOf && root.val>tree.floor){
            tree.floor=root.val;
        }
        //succeded
        if(tree.succBool){
            tree.succ=root.val;
            tree.succBool=false;
        }
        if(!tree.succBool && root.val==succOf){
            tree.succBool=true;
        }
        

        
        if(root.left!=null){
            if(flag){
                tree.height++;
                flag=false;
            };
            if(root.left.val==precOf){
                tree.prec=root.val;
            }

            que(root.left,tree,ceilOf,floorOf,precOf,succOf);
        }
        
        if(root.right!=null){
            if(flag){
                tree.height++;
                flag=false;
            };
            if(root.right.val==precOf){
                tree.prec=root.val;
            }

            que(root.right,tree,ceilOf,floorOf,precOf,succOf);
        }

        flag=true;
    }
    static class all{
        int size;
        int height;
        int max=(int)-1e9;
        int min=(int)1e9;
        int ceil=(int)1e9;
        int floor=(int)-1e9;
        int prec;
        int succ;
        boolean succBool=false;
    }
    static void construct(int[] arr){
        Stack<TreeNode> st=new Stack<>();

        for(int i:arr){
            if(i==-1){
                st.pop();
                continue;
            }

            TreeNode node=new TreeNode(i);

            if(root==null){
                root=node;
                st.push(node);
            }else{
                if(st.peek().left==null){
                    st.peek().left=node;
                    st.push(node);
                }else{
                    st.peek().right=node;
                    st.push(node);
                }
            }
        }
    }
    static ArrayList<TreeNode> rootToNode(TreeNode root,int p){
        if(root==null) return new ArrayList<>();
        if(root.val==p){
            ArrayList<TreeNode> base=new ArrayList<>();
            base.add(root);
            return base;
        }
        ArrayList<TreeNode> l=rootToNode(root.left, p);
        ArrayList<TreeNode> r=rootToNode(root.right, p);

        if(l.size()==0 && r.size()==0) return l;
        if(l.size()>0){
            l.add(0,root);

            return l;
        }

        r.add(0,root);

        return r;
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
