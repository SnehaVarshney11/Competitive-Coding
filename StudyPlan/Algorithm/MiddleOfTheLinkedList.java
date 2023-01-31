package StudyPlan.Algorithm;

class MiddleOfTheLinkedList {
    class ListNode2{
        ListNode2 next;
    }
    public ListNode2 middleNode(ListNode2 head) {
        ListNode2 a = head;
        ListNode2 b = head;
        while(b!=null && b.next!=null){
            a = a.next;
            b = b.next.next;
        }
        return a; 
    }
}