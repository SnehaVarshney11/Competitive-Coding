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
class FullBinaryTree {
    boolean isFullTree(Node node)
    {
        //add code here.
        if(node == null) return false;
        
        if(node.left == null && node.right == null) return true;
        
        if(isFullTree(node.left) && isFullTree(node.right)) return true;
        
        else return false;
    }
}
