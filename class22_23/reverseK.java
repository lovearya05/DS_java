public class reverseK {
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
            head=new Node(data);
        }else{
            Node node = new Node(data);
            node.next=head;
            head=node;
        }
    }
    static void display(Node iter){
        while(iter!=null){
            System.out.println(iter.data);
            iter=iter.next;
        }
    }
    static void getAt(int idx){
        if(idx<1){
            System.out.println("out of bound!!");
            return;
        }
        Node iter=head;
        while(idx!=1){
            if(iter.next==null){
                System.out.println("out of bound!!");
                return;
            }
            iter=iter.next;
            idx--;
        }
        System.out.println(iter.data);
    } 
    static void addLast(int data){
        Node tail=head;
        while(tail.next!=null) tail=tail.next;
        if(head==null){
            head=new Node(data);
        }else{
            Node node=new Node(data);
            tail.next=node;
            // tail = node;
        }
    }    
    static int size(Node head){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    static void reverseK(int k){     //buggy
        int sz=size(head);
        Node subst=head;
        Node back=null;
        Node ptr=head;
        Node subend=null;
        int i=1;
        Node safe=null;
        Node temp=null;
        while(i<=k*sz/k){
            if(i%k==1 && i>k){
                subst.next=back;
                // subst.next=ptr;//
                back=subend;
                back.next=ptr;
                subst=back;
            }
            // System.out.println("            -------"+i);
            safe=ptr.next;
            ptr.next=back;
            back=ptr;
            ptr=safe;
            if(i==k){
                head=back;
            }
            if(i%k==1){
                subend=back;
                temp=back;
            }
            i++;
        }
        subend.next=safe;
    }
    static void reverseK1(Node node,int k){       // o(n) method Working
        int sz=size(head);
        Node t1=node;
        head = reversehelper(head,k);
        // System.out.println("------------"+" "+node.next.data);
        for(int i=1;i<sz/k;i++){
            Node t2=reversehelper(t1.next,k);
            Node temp = t1.next;
            t1.next=t2;
            t1=temp;
        }

    }
    static Node reversehelper(Node node,int k){
        Node prev=null;
        Node curr=node;

        for(int i=1;i<=k;i++){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        node.next=curr;

        return prev;

    }

    public static void main(String[] args){
        // addFirst(140);
        // addFirst(130);
        // addFirst(120);
        // addFirst(110);
        // addFirst(100);
        // addFirst(90);
        addFirst(80);
        addFirst(70);
        addFirst(60);
        addFirst(50);
        addFirst(40);
        addFirst(30);
        addFirst(20);
        addFirst(10);
        // addLast(60);
        // addLast(70);
        // addLast(80);
        // addLast(90);
        // addLast(100); 
        reverseK1(head,3);
        display(head);
        
    }
}
