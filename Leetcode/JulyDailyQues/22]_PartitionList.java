package Leetcode.JulyDailyQues;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class PartitionList{
    public ListNode partition(ListNode head, int x) {
        if(head == null)
            return null;
        
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        
        ListNode t1 = left;
        ListNode t2 = right;

        ListNode list = head;
        
        while(list != null){
            if(list.val < x){
                t1.next = list;
                t1 = t1.next;
            }else{
                t2.next = list;
                t2 = t2.next;
            }
            list = list.next;
        }
        t1.next = right.next;
        t2.next = null;
        
        return left.next;
    }
}