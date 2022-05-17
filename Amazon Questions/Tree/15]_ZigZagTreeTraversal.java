import java.util.ArrayList;
import java.util.Stack;

class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
class ZigZagTreeTraversal {
    ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    ArrayList<Integer> list = new ArrayList<>();
	    if (root == null) return list;
	    Stack<Node> stack = new Stack<>();
	    int level = 0;
	    stack.push(root);
	    while (!stack.isEmpty()) {
	        Stack<Node> temp = new Stack<>();
	        while(!stack.isEmpty()) {
	            Node n = stack.pop();
	            list.add(n.data);
	            if (level%2==1 && n.right != null) temp.push(n.right);
	            if (n.left != null) temp.push(n.left);
	            if (level%2==0 && n.right != null) temp.push(n.right);
	        }
	        stack = temp;
	        level++;
	    }
	    return list;
	}
}
