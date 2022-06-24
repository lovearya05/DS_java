public class linkList3{
    static Node head;
    static class Node{
        int data;
        Node next;
        
        Node(){}
        Node(int data){
            this.data=data;
        }
    }
    static void addFirst(int data){
        if(head==null){
            head = new Node(data);
        }else{
            Node node=new Node(data);
            node.next=head;
            head=node;
        }
    }
    static void disp(Node iter){
        if(iter==null){
            System.out.println("out of bound");
        }
        while(iter!=null){
            System.out.println(iter.data);
            iter=iter.next;
        }
    }
    static void find_Mid(Node iter){
        if(iter==null){
            System.out.println("out of bound");
            return;
        }
        int count=0;
        Node temp1=iter,temp2=iter;
        // Node temp1=iter;
        // Node temp2=iter;
        while(temp2!=null){
            if(count%2==0){
                temp2=temp2.next;
                count++;
            }else{
                temp2=temp2.next;
                temp1=temp1.next;
                count++;
            }
        }
        System.out.println(temp1.data);
    }
    static void findIdxFromLast(Node iter,int idx){
        if(iter==null || idx<1){
            System.out.println("out of Bound!");
            return;
        }
        Node temp1=iter,temp2=iter;
        while(idx!=1){
            if(temp2.next==null){
                System.out.println("out of Bound!");
                return;
            }
            temp2=temp2.next;
            idx--;
        }
        while(temp2.next!=null){
            temp2=temp2.next;
            temp1=temp1.next;
        }
        System.out.println(temp1.data);
    }
    static Node reverse(Node iter){                 //  O(n)  create new list
        Node last = null;
        if(iter==null){
            System.out.println("Out of Bound!");
            return null;
        }
        while(iter!=null){
            int temp=iter.data;
            if(last==null){
                last = new Node(temp);
            }else{
                Node node=new Node(temp);
                node.next=last;
                last=node;
            }
            iter=iter.next;
        }
        return last;
    }
    static void reverse2(Node iter){                //  O(n*n)
        if(iter==null) return;
        int size=0;
        Node first=iter;
        while(first!=null){
            size++;
            first=first.next;
        }
        // System.out.println(size);
        int i=1;
        first = iter;
        int size2=size;
        Node last = iter;
        while(i<=size/2){
            int j=1;
            while(j<size2){
                last=last.next;
                j++;
            }
            i++;
            size2--;
            int val=last.data;
            last.data=first.data;
            first.data=val;
            first=first.next;
            last=iter;
        }

    }
    static void reverseK(Node iter,int k){          //  O(n*n) 
        if(k<2) return;
        int size=0;
        Node first=iter;
        Node end=iter;
        Node temp=null;
        while(first!=null){
            size++;
            first=first.next;
        }
        if(k>size) return;
        first=iter;
        int i=k;
        int j=1;
        int rep=size/k;
        boolean flag=true;
        while(rep!=0){                        // no of parts of reverses
            for(int l=1;l<=k/2;l++){          //reverse a part
                Node end2=end;
                while(i!=j){                 //move end ptr to end
                    if(end.next==null) return;
                    // System.out.println(end.data);
                    end=end.next;
                    i--;
                }
                i=k;
                if(flag) temp=end;
                flag=false;
                //swap
                int val=first.data;
                first.data=end.data;
                end.data=val;

                first=first.next;
                end=end2;
                j++;
            }
            flag=true;
            j=1;
            first=temp.next;
            end=first;
            rep--;
        }
    }


    public static void main(String[] args){
        addFirst(90);
        addFirst(80);
        addFirst(70);
        addFirst(60);
        addFirst(50);
        addFirst(40);
        addFirst(30);
        addFirst(20);
        addFirst(10);
        // find_Mid(head);
        // findIdxFromLast(head,2);
        // reverse(head);
        // disp(reverse(head));
        // reverse2(head);
        reverseK(head,3);
        disp(head);
    }
}

