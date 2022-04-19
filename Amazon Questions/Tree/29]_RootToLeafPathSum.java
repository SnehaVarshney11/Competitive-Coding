package Amazon Questions.Tree;

class RootToLeafPathSum{
    if (root == null) return false;
        if (root.data > S) return false;
        if (root.left == null && root.right == null) return (S==root.data);
        return hasPathSum(root.left, S-root.data) || hasPathSum(root.right, S-root.data);
}