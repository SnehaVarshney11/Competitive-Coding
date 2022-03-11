package MarchDailyQues;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        
        //compute the length
        ListNode dummy = head;
        int len = 1;
        while(dummy.next != null){
            len++;
            dummy = dummy.next;
        }
        
        dummy.next = head;
        k = k % len;
        k = len - k;
        while(k --> 0) dummy = dummy.next;
        //make node head and break connection
        head = dummy.next;
        dummy.next = null;
        
        return head;
    }
}
