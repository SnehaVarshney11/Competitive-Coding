package Amazon Questions.Tree;

class RootToLeafPathsSum {
    public static int pathSum(Node root, int i){
        if(root == null) return 0;
        i = (i*10) + root.data;
        if(root.left == null && root.right == null){
            return i;
        }
        return pathSum(root.left, i) + pathSum(root.right, i);
    }
	public static long treePathsSum(Node root)
    {
         //add code here.
         return pathSum(root, 0);
	}
}
