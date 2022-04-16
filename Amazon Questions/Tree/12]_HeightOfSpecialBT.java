class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
class HeightOfSpecailBT{
    public static boolean isLeafNode(Node node){
        return (node.left != null && node.left.right == node &&
        node.right != null && node.right.left == node);
    }
    // Return the height of the given special binary tree
    public static int findTreeHeight(Node root)
        {
            // code here.
            if(root == null) return 0;
            if(isLeafNode(root)) return 1;
            
            return 1 + Math.max(findTreeHeight(root.left), findTreeHeight(root.right));
        }
}