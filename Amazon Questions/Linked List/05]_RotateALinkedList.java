class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class RotateALinkedList {
    public Node rotate(Node head, int k) {
        // add code here
        Node cur = head;
        while(k > 1 && cur.next != null){
            cur = cur.next;
            k--;
        }
        if(cur.next == null) return head;
        
        Node newHead = cur.next;
        cur.next = null;
        Node temp = newHead;
        
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        return newHead;
    }
}
