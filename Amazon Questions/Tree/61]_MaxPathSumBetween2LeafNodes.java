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
class MaximumPathSumBetween2LeafNodes{
    int sum = Integer.MIN_VALUE;
    int maxPathSum(Node root)
    { 
        // code here 
        int ans = findSum(root);
        if(root.left == null || root.right == null)
            sum = Math.max(sum, ans);
        return sum;
    } 
    int findSum(Node root){
        if(root == null) return 0;
        int left = findSum(root.left);
        int right = findSum(root.right);
        if(root.left == null && root.right == null) 
            return root.data;
        if(root.left == null) 
            return root.data + right;
        if(root.right == null)
            return root.data + left;
        sum = Math.max(sum, left+right+root.data);
        return Math.max(left, right) + root.data;
    }
}