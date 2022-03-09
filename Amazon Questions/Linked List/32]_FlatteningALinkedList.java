class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
class FlatteningALinkedList {
    Node merge(Node a, Node b){
        Node ans = new Node(0);
        Node ansPtr = ans;
        while(a != null && b != null){
            if(a.data < b.data){
                ansPtr.bottom = a;
                a = a.bottom;
            }else{
                ansPtr.bottom = b;
                b = b.bottom;
            }
            ansPtr = ansPtr.bottom;
        }
        if(a != null) ansPtr.bottom = a;
        if(b != null) ansPtr.bottom = b;
        return ans.bottom;
    }
    Node flatten(Node root)
    {
	// Your code here
	    if(root == null || root.next == null){
	        return root;
	    }
	    root.next = flatten(root.next);
	    return merge(root, root.next);
    }
}
