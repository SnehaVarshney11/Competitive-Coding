package StudyPlan.Algorithm;

public class RemoveNthNodeFromEndOfList {
    class ListNode3{
        ListNode3 next;
    }
    public ListNode3 removeNthFromEnd(ListNode3 head, int n) {
        ListNode3 dummy = new ListNode3();
        dummy.next = head;
        
        ListNode3 p = dummy;
        ListNode3 f = dummy;
        int counter = 1;
        while(counter<=n+1){
            f = f.next;
            counter = counter+1;
        }
        while(f!=null){
            f = f.next;
            p = p.next;
        }
        p.next = p.next.next;
        return dummy.next;
    }
}
