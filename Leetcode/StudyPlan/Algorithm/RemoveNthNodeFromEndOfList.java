package StudyPlan.Algorithm;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode p = dummy;
        ListNode f = dummy;
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
