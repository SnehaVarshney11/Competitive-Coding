class Node{
    Node right, left;
}
class BinaryTreeToDLL {
    Node root;
    Node head;
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
	//  Your code here	
	    if(root == null)return null;
	    
	    bToDLL(root.right);
	    root.right = head;
	    
	    if(head != null)
	        head.left = root;
	        
	   head = root;
	   bToDLL(root.left);
	   
	   return head;
    }
}
