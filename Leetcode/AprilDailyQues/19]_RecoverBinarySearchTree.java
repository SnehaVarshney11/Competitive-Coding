package Leetcode.AprilDailyQues;

class RecoverBinarySearchTree {
    TreeNode start = null;
    TreeNode end = null;
    TreeNode prev = null;
    public void recoverTree(TreeNode root) {
        helper(root);
        
        //swap the value of nodes
        int tmp = start.val;
        start.val = end.val;
        end.val = tmp;
    }
    public void helper(TreeNode root){
        if(root == null) return;
        //use inorder traversal :- left, root, right
        helper(root.left);
        
        //if current node is smaller than previous, then prev node is invalid
        if(prev != null && root.val < prev.val){
            //store prev node
            if(start == null){
                start = prev;
            }
            //If both nodes are adjacent, save the current node in that case
            end = root;
        }
        // make curr node as prev
        prev = root;
        
        //call right subTree
        helper(root.right);
    }
}
