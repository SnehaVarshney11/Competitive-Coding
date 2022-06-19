class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
class NthNodeFromEndOfLinkedList {
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	int len = 0;
    	Node tmp = head;
    	
    	while(tmp != null){
    	    tmp = tmp.next;
    	    len++;
    	}
    	if(len < n){
    	    return -1;
    	}
    	tmp = head;
    	for (int i = 1; i < len - n + 1; i++)
    	    tmp = tmp.next;
    	 
    	return tmp.data;
    }
}
