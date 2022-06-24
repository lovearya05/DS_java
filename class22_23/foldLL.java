public class foldLL {
    static class Node{
        int val;
        Node next;

        Node(){}
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    static Node head = null;
    static Node left;
    public static void main(String[] args) {
        addFirst(60);
        addFirst(50);
        addFirst(40);
        addFirst(30);
        addFirst(20);
        addFirst(10);
        display(head);
        int size = size(head);
        left=head;
        fold(head,0,size);
        System.out.println();
        display(head);
    }
    static void fold(Node right,int count,int size){
        if(right==null) return;
        if(right.next!=null){
            fold(right.next,count+1,size);
        }
        if(count>size/2){
            Node temp = left;
            left = left.next;
            temp.next=right;
            right.next=left;
        }else if(count==size/2){
            right.next=null;
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
    static void addFirst(int val){
        Node node = new Node(val);
        // if(head==null){
        //     head=node;
        // }
        node.next=head;
        head=node;
    }
    static void display(Node temp){
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
    }

}
