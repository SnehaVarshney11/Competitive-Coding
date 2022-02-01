package Love_Babbar_Cheat_Sheet.LinkedList;

class Node{
    Node next;
}
class ReverseLinkedListInGroupsOfGivenSize {
    public static Node reverse(Node node, int k)
    {
        //Your code here
        if(node == null || node.next == null) return node;
        
        Node cur = node;
        Node prev = null;
        int count = 0;
        
        while(cur != null && count++ < k){
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        node.next = reverse(cur, k);
        return prev;
    }
}
