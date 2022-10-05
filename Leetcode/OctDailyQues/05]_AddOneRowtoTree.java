package Leetcode.OctDailyQues;

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
class AddOneRowtoTree {
    private TreeNode solve(TreeNode root, int val, int depth, String s){
        if(depth == 1){
            if(root == null) return new TreeNode(val);
            if(s.equals("left"))
                return new TreeNode(val, root, null);
            return new TreeNode(val,null, root);
        }
        if(root == null) return null;
        root.left = solve(root.left, val, depth-1,"left"); 
        root.right = solve(root.right, val, depth-1,"right");
        return root;
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
		// The last parameter as flag to determined where i should add the rest nodes (left or right).
        return solve(root,val, depth, "left");
    }
}
