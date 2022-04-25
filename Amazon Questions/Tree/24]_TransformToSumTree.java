package Amazon Questions.Tree;

class TransformToSumTree {
    public int solve(Node root){
        if(root == null) return 0;
        int val = root.data;
        int left = solve(root.left);
        int right = solve(root.right);
        root.data = left + right;
        return left + right + val;
    }
    public void toSumTree(Node root){
         //add code here.
         solve(root);
    }
}
