package Leetcode.JulyDailyQues;

import java.util.ArrayList;
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
class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        rightView(root, list, 0); //root, list, level
        return list;
    }
    public void rightView(TreeNode root, List<Integer> list, int level){
        if(root == null) return;
        if(list.size() == level){
            list.add(root.val);
        }
        rightView(root.right, list, level+1);
        rightView(root.left, list, level+1);
    }  
}
