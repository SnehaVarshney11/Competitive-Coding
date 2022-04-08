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
class HeightOfBinaryTree {
    int height(Node node) 
    {
        // code here 
        if(node == null) return 0;
        
        int left = height(node.left);
        int right = height(node.right);
        
        return 1 + Math.max(left, right);
    }
}
