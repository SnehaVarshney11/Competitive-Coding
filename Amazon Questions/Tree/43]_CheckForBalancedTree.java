package Amazon Questions.Tree;

class CheckForBalancedTree {
    boolean isBalanced(Node root)
    {
	// Your code here
	    return dfsHeight(root) != -1;
    }
    int dfsHeight(Node root){
        if(root == null) return 0;
        int lh = dfsHeight(root.left);
        int rh = dfsHeight(root.right);
        if(lh == -1 || rh == -1) return -1;
        
        if(Math.abs(rh - lh) > 1) return -1;
        
        return 1+Math.max(lh, rh);
    }
}
