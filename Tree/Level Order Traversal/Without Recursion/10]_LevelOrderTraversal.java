import java.util.LinkedList;
import java.util.Queue;

class Node{
    Node left, right;
    int data;
}
class LevelOrderTraversal {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    public void levelOrderTraversalWithQueue(Node node){
        if(node == null){
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);

        while(queue.size() > 0){
            Node top = queue.remove();
            System.out.print(top.data + " ");

            if(top.left != null){
                queue.add(top.left);
            }
            if(top.right != null){
                queue.add(top.right);
            }
        }
    }
    public static void main(String[] args) {
        LevelOrderTraversal a = new LevelOrderTraversal();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        a.levelOrderTraversalWithQueue(root);
    }
}
