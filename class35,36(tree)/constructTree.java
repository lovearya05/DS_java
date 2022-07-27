import java.util.Stack;
import java.util.ArrayList;

public class constructTree {
    static class TreeNode{
        int val;
        ArrayList<TreeNode> children=new ArrayList<>();

        TreeNode(int val){
            this.val=val;
        }
    }

    static TreeNode root;

    public static void main(String[] args) {
        int[] arr={10,20,40,-1,50,90,-1,100,-1,-1,-1,30,60,-1,70,110,-1,-1,80,-1,-1,-1};
        
        construct(arr);
        // display(root);
        question();
        // levelOrderPrint(root);
    }
    
    static void question(){
        // printZigZak(root);
        // System.out.println(size(root));
        // System.out.println(height(root));
        // System.out.println(max(root));
        ceilval=(int)1e9;
        ceil(root,86);
        System.out.println(ceilval);
        // floorval=(int)-1e9;
        // floor(root,86);
        // System.out.println(floorval);
        // boolean tempflag=find(root,20);
        // if(tempflag){
        //     predandsucc(root, 20);
        //     System.out.println(pred+"\n"+succ);
        // }
    }

    static boolean find(TreeNode root,int val){

        if(root.val==val){
            return true;
        }

        boolean flag1=false;
        for(TreeNode node:root.children){
            flag1=flag1 || find(node,val);
        }

        return flag1;
    }

    static int pred=-1;
    static int succ=-1;
    static int flag=0;
    static void predandsucc(TreeNode root,int val){
        if(flag==0 && root.val!=val){
            pred=root.val;
        }else if(root.val==val){
            flag=1;
        }else if(flag==1){
            succ=root.val;
            flag=2;
        }

        for(TreeNode node:root.children){
            if(flag==2){
                return;
            }
            predandsucc(node, val);
        }
    }

    static void display(TreeNode root){
        System.out.print(root.val+"==>");

        for(TreeNode node:root.children){
            System.out.print(node.val+",");
        }
        System.out.println();
        for(TreeNode node:root.children){
            display(node);
        }
    }

    static void construct(int[] arr){
        Stack<TreeNode> st =new Stack<>();

        for(int i:arr){

            if(i==-1){
                st.pop();
                continue;
            }

            TreeNode node=new TreeNode(i);

            if(root==null){
                root=node;
            }
            if(st.size()==0){
                st.push(node);
            }else{
                st.peek().children.add(node);
                st.push(node);
            }
        }
    }

    static void levelOrderPrint(TreeNode root){
        ArrayList<TreeNode> queue=new ArrayList<>();

        queue.add(root);

        while(queue.size()!=0){
            int sz=queue.size();

            while(sz--!=0){
                TreeNode rm=queue.remove(0);
                System.out.print(rm.val+" ");

                for(TreeNode node:rm.children){
                    queue.add(node);
                }
            }

            System.out.println();
        }
    }

    static int ceilval;
    static int floorval;
    static void ceil(TreeNode root,int val){
        if(root.val>val && root.val<ceilval){
                ceilval=root.val;            
        }
        for(TreeNode node:root.children){
            ceil(node,val);
        }

    }
    static void floor(TreeNode root,int val){
        if(root.val<val && root.val>floorval){
                floorval=root.val;            
        }
        for(TreeNode node:root.children){
            floor(node,val);
        }

    }
    
    static int height(TreeNode root){
        int maxval=0;
        for(TreeNode node:root.children){
            int temp=height(node);
            if(temp>maxval){
                maxval=temp;

            }
        }
        return maxval+1;
    }
    
    static int max(TreeNode root){
        int maxval=root.val;
        for(TreeNode node:root.children){
            int temp=max(node);
            if(temp>maxval){
                maxval=temp;

            }
        }
        return maxval;
    }
    static int size(TreeNode root){
        // ArrayList<TreeNode> queue=new ArrayList<>();
        // int count=0;
        // queue.add(root);

        // while(queue.size()!=0){
        //     TreeNode rn=queue.remove(0);
        //     count++;
        //     for(TreeNode i:rn.children){
        //         queue.add(i);
        //     }
        // }

        // System.out.println(count);

        int count =1;
        boolean flag=true;
        for(TreeNode node:root.children){
            count+=size(node);
        }
        return count;
    }

    static void printZigZak(TreeNode root){
        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();

        boolean flag=true;

        st1.push(root);
        while(st1.size()!=0){
            
            while(st1.size()!=0){
                TreeNode rn=st1.pop();
                System.out.print(rn.val+" ");
            

                if(flag){
                    for(int i=0;i<rn.children.size();i++){
                        st2.push(rn.children.get(i));
                    }
                
                }else{
                    for(int i=rn.children.size()-1;i>=0;i--){
                        st2.push(rn.children.get(i));

                    }
                }
            }

            flag=!flag;

            Stack<TreeNode> temp=st1;
            st1=st2;
            st2=temp;
        }
    }
        
}

    

