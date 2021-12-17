package DecDailyQues;

class ListNode{
    int val;
    ListNode next;
}
class ConvertBinaryNumInLinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        int res= 0;
        while(head != null){
            res = res * 2;
            res = res + head.val;
            head = head.next;
        }
        return res;
    }    
}
