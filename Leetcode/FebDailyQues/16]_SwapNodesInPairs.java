package FebDailyQues;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head.next;
        head.next = swapPairs(head.next.next);
        temp.next = head;
        return temp;
    }
}
