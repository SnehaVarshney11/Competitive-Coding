package DecDailyQues;

class TreeNode{
    TreeNode left, right;
    int val;
}
class MaxDifferenceBetweenNodeAndAncestor {
    public int maxAncestorDiff(TreeNode root, int ancestor_min, int ancestor_max) {
        if (root != null) 
            return Math.max(maxAncestorDiff(root.left, Math.min(root.val, ancestor_min), Math.max(root.val, ancestor_max)),
                   maxAncestorDiff(root.right, Math.min(root.val, ancestor_min), Math.max(root.val, ancestor_max)));
        else 
            return ancestor_max - ancestor_min;
    }

    public int maxAncestorDiff(TreeNode root) {
        return maxAncestorDiff(root, 100000, 0);
    }
}
