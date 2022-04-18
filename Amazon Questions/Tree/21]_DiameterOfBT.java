package Amazon Questions.Tree;

class DiameterOfBT {
    int diameter(Node root) {
        // Your code here
        if(root == null) return 0;
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int sum = ht(root.left) + ht(root.right) + 1;
        return Math.max(sum, Math.max(ld, rd));
    }
    public int ht(Node root){
        if(root == null) return 0;
        int left = ht(root.left);
        int right = ht(root.right);
        
        return 1 + Math.max(left, right);
    }
}
