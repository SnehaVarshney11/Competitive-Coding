class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
class FindLengthOfLoop {
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                int count = 1;
                slow = slow.next;
                while(slow != fast){
                    count++;
                    slow = slow.next;
                }
                return count;
            }
        }
        return 0;
    }
}
