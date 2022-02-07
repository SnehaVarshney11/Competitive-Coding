class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
class PairwiseSwapElements {
    public Node pairwiseSwap(Node head)
    {
        // code here
        if(head == null || head.next == null) return head;
        
        Node node1 = head, node2 = head.next, node3 = head.next.next;
        node2.next = node1;
        node1.next = pairwiseSwap(node3);
        return node2;
    }
}
