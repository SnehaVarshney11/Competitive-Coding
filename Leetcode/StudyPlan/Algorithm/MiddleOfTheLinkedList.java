package StudyPlan.Algorithm;

class ListNode{
    public ListNode(int i) {
    }

    ListNode next; 
}
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode a = head;
        ListNode b = head;
        while(b!=null && b.next!=null){
            a = a.next;
            b = b.next.next;
        }
        return a; 
    }
}
