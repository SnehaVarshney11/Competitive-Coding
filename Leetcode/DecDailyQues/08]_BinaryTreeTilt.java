package DecDailyQues;

class TreeNode{
    TreeNode left, right;
    int val;
}
class BinaryTreeTilt {
    int diff = 0;
    public int findTilt(TreeNode root) {
        helper(root);
        return diff;
    }
    int helper(TreeNode root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return root.val;
        int left = helper(root.left);
        int right = helper(root.right);
        diff += Math.abs(left - right);
        return left + right + root.val;
    }    
}
