package Amazon Questions.Tree;

class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
}
class MirrorTree {
    void mirror(Node node) {
        // Your code here
        if(node == null) return;
        
        mirror(node.right);
        mirror(node.left);
        
        Node n = node.left;
        node.left = node.right;
        node.right = n;
    }
}
