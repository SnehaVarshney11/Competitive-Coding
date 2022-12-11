package Leetcode.DecDaily;

class TreeNode {
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
class MaximumPathSum {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);
        return res;
    }
    public int solve(TreeNode root){
        //Base cond
        if(root == null)
            return 0;
        //hypothesis
        int l = Math.max(solve(root.left),0);
        int r = Math.max(solve(root.right),0);
        //Induction
        res = Math.max(res, root.val + l + r);
        return root.val + Math.max(l,r);
    }
}
