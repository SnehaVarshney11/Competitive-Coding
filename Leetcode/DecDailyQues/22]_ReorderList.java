package DecDailyQues;

class ListNode{
    ListNode next;
}
class ReorderList {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
        //Find the middle of the list
        ListNode p1 = head;
        ListNode p2 = head.next;
        
        while(p2.next != null && p2.next.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        
        //Reverse the half of the middle
        ListNode preMiddle = p1;
        ListNode preCurrent = p1.next;
        
        while(preCurrent.next != null){
            ListNode current=preCurrent.next;
            
            preCurrent.next=current.next;
            current.next=preMiddle.next;
            preMiddle.next=current;
        }
        p1=head;
        p2=preMiddle.next;
        while(p1!=preMiddle){
            preMiddle.next=p2.next;
            p2.next=p1.next;
            p1.next=p2;
            p1=p2.next;
            p2=preMiddle.next;
        }
    }    
}
