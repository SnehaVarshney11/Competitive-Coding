import java.util.Stack;

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class CheckIfLinkedListIsPalindrome {
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Node slow = head;
        boolean isPalin = true;
        Stack<Integer> st = new Stack<>();
        
        while(slow != null){
            st.push(slow.data);
            slow = slow.next;
        }
        
        while(head != null){
            int i = st.pop();
            if(head.data == i){
                isPalin = true;
            }else{
                isPalin = false;
                break;
            }
            head = head.next;
        }
        return isPalin;
    }  
}
