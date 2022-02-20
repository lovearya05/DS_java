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