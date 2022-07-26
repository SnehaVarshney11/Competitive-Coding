package July;

class Node{
    Node left, right;
    int data;
}
class MaximumSumLeafToRootPath {
    public static int maxPathSum(Node root)
    {
        //code here
        if( root == null){
           return 0;
        }
        int left = maxPathSum(root.left);
        int right = maxPathSum(root.right);
        int s = Math.max(left,right);
       return s+root.data;
    }
}
