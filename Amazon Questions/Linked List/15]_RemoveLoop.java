import java.util.HashSet;

class Node
{
    int data;
    Node next;
}
class RemoveLoop {
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        HashSet<Node> set = new HashSet<Node>();
        Node cur = null;
        if(head == null) return;
        else{
            while(head != null){
                if(set.contains(head)){
                    cur.next = null;
                    break;
                }else{
                    set.add(head);
                    cur = head;
                    head = head.next;
                }
            }
        }
    }
}
