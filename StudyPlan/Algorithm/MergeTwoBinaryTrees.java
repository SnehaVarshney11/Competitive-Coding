package StudyPlan.Algorithm;

class TreeNode{
    int val;
    TreeNode left, right;
    public TreeNode(int item)
    {
        val = item;
        left = right = null;
    }
}


public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1, root2);
    }
    public TreeNode merge(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null)
            return null;
        if(root1 == null && root2 != null)
            return root2;
        if(root1 != null && root2 == null)
            return root1;
        
        TreeNode sum = new TreeNode(root1.val + root2.val);
        
        sum.left = merge(root1.left , root2.left);
        
        sum.right = merge(root1.right , root2.right);
        
        return sum;
    }
}
