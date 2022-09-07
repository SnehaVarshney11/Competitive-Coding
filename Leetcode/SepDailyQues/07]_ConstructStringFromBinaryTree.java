package Leetcode.SepDailyQues;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}    TreeNode(int val) { this.val = val; }    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;    }}
class ConstructStringFromBinaryTree {
    public String tree2str(TreeNode root) {
        if (root == null) return "";
        
        String ans = root.val + "";
        
        String left = tree2str(root.left);
        String right = tree2str(root.right);
        
        if (left == "" && right == "") return ans;
        if (left == "") return ans + "()" + "(" + right + ")";
        if (right == "") return ans + "(" + left + ")";
        return ans + "(" + left + ")" + "(" + right + ")";
    }
}
