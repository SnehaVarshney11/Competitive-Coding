package Leetcode.JuneDailyQues;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null && headB==null) return null;
        
        ListNode pointer_a = headA;
        ListNode pointer_b = headB;
        
        while(pointer_a!=pointer_b){
            if(pointer_a==null){
                pointer_a = headB;
            } else{
                pointer_a = pointer_a.next;
            }
            
            if(pointer_b==null){
                pointer_b = headA;
            } else{
                pointer_b = pointer_b.next;
            }
        }
        return pointer_a; 
      
    }
}
