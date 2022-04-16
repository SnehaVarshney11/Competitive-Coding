package Amazon Questions.Tree;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

class RemoveHalfNodes {
    public static Node RemoveHalfNodes(Node root)
    {
        // Code Here
        if(root == null) return null;
        
        if(root.left == null && root.right == null){
            return root;
        }
        if(root.left == null && root.right != null){
            return RemoveHalfNodes(root.right);
        }
        if(root.left != null && root.right == null){
            return RemoveHalfNodes(root.left);
        }
        root.left = RemoveHalfNodes(root.left);
        root.right = RemoveHalfNodes(root.right);
        
        return root;
    }
}
