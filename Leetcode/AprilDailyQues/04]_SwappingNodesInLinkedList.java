package AprilDailyQues;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class SwappingNodesInLinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head;
        ListNode right = head;
        int count = 0;
        while(left != null){
            count++;
            if(count == k) break;
            left = left.next;
        }
        ListNode node = left;
        while(node.next != null){
            node = node.next;
            right = right.next;
        }
        int tmp = left.val;
        left.val = right.val;
        right.val = tmp;
        
        return head;
    }
}
