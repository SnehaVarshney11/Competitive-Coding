package JanDailyQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TreeNode{
    TreeNode left, right;
    int val;
}
class AllElementsInTwoBinarySearchTrees {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res = new ArrayList<>();
        connectTree(root1, res);
        connectTree(root2, res);
        Collections.sort(res);
        return res;
    }
    public void connectTree(TreeNode root, List<Integer> res){
        if(root == null) return;
        connectTree(root.left, res);
        res.add(root.val);
        connectTree(root.right, res);
    }
}
