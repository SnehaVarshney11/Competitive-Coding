package August;

class Node
{
	Node left, right;
	int data;
	
	Node(int d)
	{
		data = d;
		left = right = null;
	}
	
}
class BinaryTreeToDLL {
    Node head=null;
    Node prev=null;
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
	//  Your code here	
	    if(root!=null)
    {
        bToDLL(root.left);
        if(prev==null){
            head=root;
        }else{
            prev.right=root;
            root.left=prev;
        }
        prev=root;
        bToDLL(root.right);
        return head;
    }
    return null;
    }
}
