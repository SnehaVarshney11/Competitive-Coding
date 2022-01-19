package JanDailyQues;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
 }
class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode run = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                while(slow != run){
                    slow = slow.next;
                    run = run.next;
                }
                return run;
            }
        }
        return null;
    }
}
