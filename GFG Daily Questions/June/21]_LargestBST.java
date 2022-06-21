package June;

class Node  
{ 
    int data; 
    Node left, right;
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}
class BSTNode {
    int maxNodeVal;
    int minNodeVal;
    int maxSize;
    
    public BSTNode(int minNodeVal, int maxNodeVal, int maxSize) {
        this.minNodeVal = minNodeVal;
        this.maxNodeVal = maxNodeVal;
        this.maxSize = maxSize;
    }
}
class LargestBST {
    public static BSTNode helper(Node root) {
        if (root == null) {
            return new BSTNode(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }
        
        BSTNode left = helper(root.left);
        BSTNode right = helper(root.right);

        if (left.maxNodeVal < root.data && root.data < right.minNodeVal) {
            return new BSTNode(Math.min(left.minNodeVal, root.data), Math.max(right.maxNodeVal, root.data), left.maxSize + right.maxSize + 1);
        }
        
        return new BSTNode(Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(left.maxSize, right.maxSize));
    }
    
    
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root) {
        if (root == null) return 0;
        
        return helper(root).maxSize;
    }
}
