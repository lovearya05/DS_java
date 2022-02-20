public class mergeSortedLL {
    static Node head;
    static Node head1;
    static class Node{
        int data;
        Node next;
        
        Node(){}
        Node(int data){
            this.data=data;
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
    static void addFirst(int data){
        if(head==null){
            head = new Node(data);
        }else{
            Node node=new Node(data);
            node.next=head;
            head=node;
        }
    }
    static void addFirst1(int data){
        if(head1==null){
            head1 = new Node(data);
        }else{
            Node node=new Node(data);
            node.next=head1;
            head1=node;
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
        addFirst1(90);
        addFirst1(80);
        addFirst1(70);
        addFirst1(60);
        addFirst1(50);
        addFirst1(40);
        addFirst1(30);
        addFirst1(20);
        addFirst1(10);
        // disp(head);
        disp(head1);

    }
    

}
