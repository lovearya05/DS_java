public class linkList2 {
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
    static void disp(Node iter){
        while(iter!=null){
            System.out.println(iter.data);
            iter=iter.next;
        }
    }
    static void getfirst(Node val){
        System.out.println(val.data);
    }
    static void getLast(Node iter){
        while(iter.next!=null) iter=iter.next;
        System.out.println(iter.data);
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
    static void removeFirst(Node iter){
        if(iter==null){
            System.out.println("out of Bound!");  
            return;
        }
        // System.out.println("removed element "+head.data);
        Node temp = iter.next;
        iter.next=null;
        head = temp;
    }
    static void removeLast(Node iter){
        if(iter==null) return;
        if(iter.next==null){
            System.out.println("Removed Element "+iter.data);
            head = null;
        }else{
            while(iter.next.next!=null) iter=iter.next;
            System.out.println("Removed Element "+iter.next.data);
            iter.next=null;
        }
    }
    static void removeAt(int idx){
        if(idx<0){
            System.out.println("out of bounce");
        }else if(idx==1){
            head=head.next;
        }else if(idx==2){
            head.next=head.next.next;
        }else{
        Node iter=head;
        while(idx!=2){
            if(iter.next.next==null){
                iter=null;
                break;
            }
            iter=iter.next;
            idx--;
        }
        if(iter==null){
            System.out.println("out of bound!!");
        }else{
            iter.next = iter.next.next;
        }
        }
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
    static int findMid(){


        if(head==null){
            return (int)-1e9;
        }

        Node slow=head;
        Node fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow.data;

    }
    static Node getAdd(Node head){
        if(head==null) return null;
        Node re = head;
        return re;
    }
    
    public static void main(String[] args){
        addFirst(50);
        addFirst(40);
        addFirst(30);
        addFirst(20);
        addFirst(10);
        addLast(60);
        addLast(70);
        addLast(80);
        addLast(90);
        addLast(100);
        // getfirst(head);
        // getLast(head);
        // getAt(5);
        // removeLast(head);
        // removeLast(head);
        // removeAt(6);
        // removeFirst(head);
        // removeFirst(head);
        // removeFirst(head); 
        // disp(head);
        // System.out.println(size(head));
        // System.out.println(findMid());
        // System.out.println();
        Node re = getAdd(head);
        // getfirst(re);
        // getLast(re);
        // getAt(5);
        // removeLast(re);
        // removeLast(re);
        // removeAt(6);
        // removeFirst(re);
        // removeFirst(re); 
        // disp(head);
        
    }
}
