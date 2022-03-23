class Node {
    int data;
     Node next;
     Node(int d)  { data = d;  next = null; }
 }
class IntersectionOfTwoSortedLinkedLists {
    public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node dummy = new Node(-1);
        Node ans = dummy;
        Node t1 = head1;
        Node t2 = head2;
        
        while(t1 != null && t2 != null){
            if(t1.data == t2.data){
                Node n = new Node(t1.data);
                dummy.next = n;
                t1 = t1.next;
                t2 = t2.next;
                dummy = dummy.next;
            }else if(t1.data > t2.data){
                t2 = t2.next;
            }else{
                t1 = t1.next;
            }
        }
        return ans.next;
    }
}
