class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
class MergeTwoSortedLinkedLists {
    Node sortedMerge(Node head1, Node head2) {
        // This is a "method-only" submission. 
        // You only need to complete this method
           if(head1 == null) return head2;
           if(head2 == null) return head1;
           
           Node ll = new Node(0);
           Node cur = ll;
           while(head1 != null && head2 != null){
               if(head1.data <= head2.data){
                   cur.next = head1;
                   head1 = head1.next;
               }else{
                   cur.next = head2;
                   head2 = head2.next;
               }
               cur = cur.next;
           }
           cur.next = head1 == null ? head2 : head1; 
           return ll.next;
      } 
}
