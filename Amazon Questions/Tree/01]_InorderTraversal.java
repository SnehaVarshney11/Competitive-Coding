import java.util.ArrayList;

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
class InorderTraversal {
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> al = new ArrayList<>();
        
        if(root == null) return al;
        
        al.addAll(inOrder(root.left));
        al.add(root.data);
        al.addAll(inOrder(root.right));
        
        return al;
        
    }
}
