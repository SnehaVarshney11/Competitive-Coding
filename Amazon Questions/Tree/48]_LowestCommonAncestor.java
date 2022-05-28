class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class LowestCommonAncestor{
    Node lca(Node root, int n1,int n2)
	{
		// Your code here
		if(root == null || n1 == root.data || n2 == root.data){
		    return root;
		}
		Node left = lca(root.left, n1, n2);
		Node right = lca(root.right, n1, n2);
		
		if(left == null)
		    return right;
		else if(right == null)
		    return left;
		else
		    return root;
	}
}