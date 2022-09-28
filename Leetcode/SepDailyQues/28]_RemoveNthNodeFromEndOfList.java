package Leetcode.SepDailyQues;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class RemoveNthNodeFromEndOfList {
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
