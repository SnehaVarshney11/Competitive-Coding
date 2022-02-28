class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
class RearrangeALinkedList {
    void rearrangeEvenOdd(Node head)
    {
          //  The task is to complete this method
          Node odd = head;
          Node even = head.next;
          Node evenHead = head.next;
          
          while(even != null && even.next != null){
              odd.next = even.next;
              even.next = even.next.next;
              odd = odd.next;
              even = even.next;
          }
          odd.next = evenHead;
     }
}
