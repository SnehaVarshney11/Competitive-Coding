package FebDailyQues;

import java.util.ArrayList;
import java.util.Collections;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class SortList {
    public ListNode sortList(ListNode head) {
        ListNode Fake = new ListNode(-1);
    ArrayList<Integer> list = new ArrayList<>();
    ListNode temp = head;
    while(temp!=null){
        list.add(temp.val); 
        temp=temp.next;
    }
    Collections.sort(list);
    ListNode FakeHead = Fake;
    for(int i =0; i<list.size(); i++){
        FakeHead.next = new ListNode(list.get(i));
        FakeHead = FakeHead.next;
    }
    return Fake.next;
}
}
