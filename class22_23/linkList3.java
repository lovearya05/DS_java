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
static int getSize(Node headtemp){

        Node temp=headtemp;

        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }

        return count;
    }    
static void Reverse(){ 
    Node prev=null;
    Node Next=head;

    while(Next!=null){
        Node temp=Next.next;
        Next.next=prev;
        prev=Next;
        Next=temp;
    }
    head=prev;
}
static Node getNodeAt(int idx){

    Node temp=head;
    while(idx--!=1){
        temp=temp.next;
    }

    return temp;

}
static void findIntersection(){

    Node head2=new Node(90);
    Node node1=new Node(80);

    head2.next=node1;
    node1.next=getNodeAt(4);

    int size1=getSize(head);
    int size2=getSize(head2);
    
    int diff=Math.abs(size1-size2);

    Node temp1=head;
    Node temp2=head2;

    if(size1>size2){
        while(diff--!=0){
            temp1=temp1.next;
        }
    }else{
        while(diff--!=0){
            temp2=temp2.next;
        }
        
    }

    while(temp1!=temp2){
        temp1=temp1.next;
        temp2=temp2.next;
    }
    
    System.out.println(temp1.data);
    // disp(head);
    // System.out.println("----------------------");
    // disp(head2);


}

static void removeDublicacy(){
    if(head==null || head.next==null) return;
    Node temp=head.next;
    int value=head.data;
    Node prev=head;
    Node temp2=temp;
    
    while(temp!=null){
        if(value==temp.data){
            // if(temp.next==null){
            //     prev.next=null;
            //     return;
            // }
            prev.next=temp.next;
            temp2=temp.next;
            temp.next=null;
            temp=temp2;
            
        }else{
            value=temp.data;
            prev=prev.next;
            temp=temp.next;
        }
    }
}
static void removeDublicacy2(){
    Node temp=head;                  //O(n)

    while(temp!=null){
        
        Node temp2=temp;
        while(temp2.next!=null && temp2.next.data==temp.data){
            temp2=temp2.next;
        }

        temp.next=temp2.next;
        if(temp!=temp2){
            temp2.next=null;
        }
        temp=temp.next;
    
    }
}
static void findcycle(){

    Node link=getNodeAt(3);
    Node last=getNodeAt(9);
    last.next=link;

    Node slow=head.next;
    Node fast=head.next.next;

    while(slow!=fast){
      slow=slow.next;
      fast=fast.next.next;
    }


    fast=head;

    while(fast.next!=slow.next){
        slow=slow.next;
        fast=fast.next;
    }


    // disp(head);
    System.out.println(slow.next.data);
    slow.next=null;



    // disp(head);


}

    public static void main(String[] args){
        addFirst(90);
        addFirst(80);
        addFirst(70);
        addFirst(60);
        addFirst(50);
        addFirst(40);
        // addFirst(40);
        addFirst(30);
        // addFirst(20);
        // addFirst(20);
        addFirst(20);
        addFirst(10);
        // addFirst(10);
        // find_Mid(head);
        // findIdxFromLast(head,4);
        // reverse(head);
        // disp(reverse(head));
        // reverse2(head);
        // reverseK(head,10);   O(n*n)
        // Reverse();
        // findIntersection();
        // removeDublicacy();
        // removeDublicacy2();
        // findcycle();
        disp(head);

    }
}

