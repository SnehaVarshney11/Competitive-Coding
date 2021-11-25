package StudyPlan.Algorithm;


public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        
        while(list1 != null && list2 != null){
            curr.next = list1;
            list1 = list1.next;
            curr = curr.next;
        }
        curr.next = list1 == null? list2:list1;
        return dummy.next;
    }
}
