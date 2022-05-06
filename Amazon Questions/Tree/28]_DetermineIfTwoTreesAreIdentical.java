class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
class DetermineIfTwoTreesAreIdentical {
    //Function to check if two trees are identical.
	boolean isIdentical(Node root1, Node root2)
	{
	    // Code Here
	    if(root1 == null || root2 == null) return root1 == root2;
	    return (root1.data == root2.data) && isIdentical(root1.left, root2.left)
	    && isIdentical(root1.right, root2.right);
	}
}
