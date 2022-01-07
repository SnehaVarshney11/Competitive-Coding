package JanDailyQues;

import java.util.ArrayList;

class ListNode{
    int val;
    ListNode next;
}
class LinkedListRandomNode {
    private ArrayList<Integer> al = new ArrayList<>();
    public void Solution(ListNode head) {
        while(head != null){
            al.add(head.val);
            head = head.next;
        }
    }
    
    public int getRandom() {
        int val = (int)(Math.random() * al.size());
        return al.get(val);
    }
}
