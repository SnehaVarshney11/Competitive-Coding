class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class InsertInSortedList {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        //Base Cond.
        if(head1==null){
            Node n1 = new Node(key);
            return n1;
        }
        if(head1.data>key){
            Node temp = new Node(key);
            temp.next = head1;
            return temp;
        }
        Node t1 = head1;
        while(t1.next!=null && t1.next.data<key){
            t1 = t1.next;
        }
        if(t1.next==null){
            Node temp = new Node(key);
            t1.next = temp;
            return head1;
        }
        Node t2 = t1.next;
        Node n2 = new Node(key);
        t1.next = n2;
        n2.next = t2;
        return head1;
    }
}
