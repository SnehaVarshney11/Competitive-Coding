package Leetcode.AugDailyQues;

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
class  ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;;;
        if(n == 0) return null;
        TreeNode head = helper(nums, 0, n-1);
        return head;
    }
    public TreeNode helper(int[] nums, int s, int e){
        //Base Case
        if(s > e) return null;
        int mid = s + (e-s)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, s, mid-1);
        node.right = helper(nums, mid+1, e);
        return node;
    }
}
