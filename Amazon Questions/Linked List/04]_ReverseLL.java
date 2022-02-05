class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
}
class ReverseLL {
    Node reverseList(Node head)
    {
        // code here
        Node previous = null;
        
        while(head!=null){
            Node next_node = head.next;
            head.next = previous;
            previous = head;
            head = next_node;
        }
        return previous; 
    }
}
