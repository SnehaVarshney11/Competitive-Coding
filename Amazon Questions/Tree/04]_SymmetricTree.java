class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
class SymmetricTree {
    public static boolean isSymmetric(Node root)
    {
        // add your code here;
        if(root == null) return true;
        
        return isSym(root.left, root.right);
    }
    public static boolean isSym(Node l, Node r){
        if(l == null && r == null) return true;
        else if(r == null || l == null) return false;
        
        if(l.data != r.data) return false;
        
        if(!isSym(l.left, r.right)) return false;
        if(!isSym(l.right, r.left)) return false;
        
        return true;
    }
}
