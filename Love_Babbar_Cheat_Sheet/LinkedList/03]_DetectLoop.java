package Love_Babbar_Cheat_Sheet.LinkedList;

class DetectLoop {
    public static boolean detectLoop(Node head){
        // Add code here
        if(head == null) return false;
        
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
