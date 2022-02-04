class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
class DeleteMiddle {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = head;
        while(temp != null){
            if(temp.next == slow){
                temp.next = slow.next;
            }
            temp = temp.next;
        }
        return head;
    }
}
