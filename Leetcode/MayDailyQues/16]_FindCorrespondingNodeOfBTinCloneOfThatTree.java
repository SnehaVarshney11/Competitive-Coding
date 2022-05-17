package Leetcode.MayDailyQues;

class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
}
class FindCorrespondingNodeOfBTinCloneOfThatTree {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == null){
            return null;
        }   
        if(original == target){
            return cloned;
        }
        TreeNode left = getTargetCopy(original.left, cloned.left, target);
        TreeNode right = getTargetCopy(original.right, cloned.right, target);
        
        if(left != null || right != null){
            if(left == null) return right;
            return left;
        }
        return null;
    }
}
