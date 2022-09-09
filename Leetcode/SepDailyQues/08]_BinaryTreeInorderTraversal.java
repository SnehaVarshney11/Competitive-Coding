package Leetcode.SepDailyQues;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
	TreeNode left, right;
	int val;
}
class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
		if(root == null)
			return list;
		
		list.addAll(inorderTraversal(root.left));
		list.add(root.val);
		list.addAll(inorderTraversal(root.right));
		
		return list;
    }
}
