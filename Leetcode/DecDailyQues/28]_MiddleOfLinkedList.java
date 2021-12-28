package DecDailyQues;

class ListNode{
    ListNode next;
}
class MiddleOfLinkedList{
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