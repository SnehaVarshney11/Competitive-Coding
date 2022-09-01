package Leetcode.SepDailyQues;

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
class CountGoodNodesInBinaryTree {
    int good_tree;
    public int goodNodes(TreeNode root) {
        good_tree = 0;
        findGood(root, Integer.MIN_VALUE);
        
        return good_tree;
    }
    public void findGood(TreeNode root, int max){
        if(root == null) return;
        if(root.val >= max) good_tree++;
        max = Math.max(max, root.val);
        
        findGood(root.left, max);
        findGood(root.right, max);
    }
}
