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
class PseudoPalindromicPaths {
    int ans = 0;
    int[] ar = new int[10];
    
    public int pseudoPalindromicPaths (TreeNode root) {
        helper(root);
        return ans;
    }
    public void helper(TreeNode node){
        if(node == null) return;
        ar[node.val]++;
        
        if(node.left == null && node.right == null){
            int cnt = 0;
            for(int i = 1; i <= 9; i++){
                cnt += ar[i]%2;
            }
            if(cnt == 1 || cnt == 0) ans++;
        }
        helper(node.left);
        helper(node.right);
        ar[node.val]--;
    }
}
