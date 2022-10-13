package Leetcode.OctDailyQues;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
