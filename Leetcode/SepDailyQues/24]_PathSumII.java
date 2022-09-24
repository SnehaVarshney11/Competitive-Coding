package Leetcode.SepDailyQues;

import java.util.LinkedList;
import java.util.List;

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
class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum){
        List<List<Integer>> result  = new LinkedList<List<Integer>>();
        List<Integer> currentResult  = new LinkedList<Integer>();
        pathSum(root,sum,currentResult,result);
        return result;
    }
    
    public void pathSum(TreeNode root, int sum, List<Integer> currentResult,
            List<List<Integer>> result) {
    
        if (root == null)
            return;
        currentResult.add(new Integer(root.val));
        if (root.left == null && root.right == null && sum == root.val) {
            result.add(new LinkedList<>(currentResult));
            currentResult.remove(currentResult.size() - 1);//don't forget to remove the last integer
            return;
        } else {
            pathSum(root.left, sum - root.val, currentResult, result);
            pathSum(root.right, sum - root.val, currentResult, result);
        }
        currentResult.remove(currentResult.size() - 1);
    }
}
