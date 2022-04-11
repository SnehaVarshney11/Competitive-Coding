class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class CheckIfTreeIsIsomorphic {
    boolean isIsomorphic(Node root1, Node root2)  
    { 
         // code here.
         if(root1 == null && root2 == null) return true;
         
         if(root1 == null || root2 == null || 
            root1.data != root2.data) return false;
            
         return (isIsomorphic(root1.left, root2.left) && 
            isIsomorphic(root1.right, root2.right)) || 
            (isIsomorphic(root1.left, root2.right) && 
            isIsomorphic(root1.right, root2.left));
    }
}
