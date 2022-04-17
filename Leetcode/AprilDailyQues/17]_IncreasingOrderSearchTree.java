package Leetcode.AprilDailyQues;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class IncreasingOrderSearchTree {
    TreeNode curr;
    public TreeNode increasingBST(TreeNode root) {
        //create dummy node
        TreeNode dummy = new TreeNode(-1);
        curr = dummy;
        
        dfs(root);
        return dummy.right;
    }
    private void dfs(TreeNode node){
        if(node == null)
            return;
        dfs(node.left);
        
        curr.right = new TreeNode(node.val);
        curr = curr.right;
        
        dfs(node.right);
    }
}
