class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
class Solution
{
    //create a method of add with carry
    public static int addWithCarry(Node head){
        //if head is null, simply return carry
        if(head == null)
            return 1;
        
        //add carray
        int res = head.data + addWithCarry(head.next);
        //update data and return new carry
        head.data = (res)%10;
        return (res)/10;
    }
    
    public static Node addOne(Node head) 
    { 
        //code here.
        int carry = addWithCarry(head);
        
        if(carry > 0){
            Node newNode = new Node(carry);
            newNode.next = head;
            return newNode;
        }
        return head;
    }
}
