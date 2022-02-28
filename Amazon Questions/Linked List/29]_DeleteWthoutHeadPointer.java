class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class DeleteWthoutHeadPointer {
    void deleteNode(Node del)
    {
         // Your code here
         if(del.next == null){
             del = null;
         }else{
             del.data = del.next.data;
             del.next = del.next.next;
         }
    }
}
