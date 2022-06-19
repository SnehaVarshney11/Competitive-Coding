package June;

class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class ReverseSublistOfLL {
    public static Node reverseBetween(Node head, int m, int n)
    {
        //code here
        Node dummy = new Node(-1);
        Node pre = dummy;
        dummy.next = head;
        
        for(int i = 0; i < m-1; ++i)
            pre = pre.next;
        Node curr = pre.next;
        
        while(m++ < n){
            Node temp = curr.next;
            curr.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }
        return dummy.next;
    }
}
