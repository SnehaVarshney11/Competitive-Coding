package Leetcode.AprilDailyQues;

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
class SearchInBST {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null){
            if(root.val > val) 
                root = root.left;
            else if(root.val < val)
                root = root.right;
            else 
                return root;
        }
        return root;
    }
}
