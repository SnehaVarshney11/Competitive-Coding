import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node{
    Node left, right;
    int data;
}
class RevLevelOrderTraversal {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    public void revLevelOrderTraversalWithoutRec(Node node){
        if(node == null) return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        Stack<Node> st = new Stack<Node>();

        while(q.size() > 0){
            Node top = q.remove();
            //st.push(top);
            if(top.right != null){
                q.add(top.right);
            }
            if(top.left != null){
                q.add(top.left);
            }
            st.push(top);
        }
        while(st.size() > 0){
            System.out.print(st.pop().data + " ");
        }
    }
    public static void main(String[] args) {
        RevLevelOrderTraversal a = new RevLevelOrderTraversal();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        a.revLevelOrderTraversalWithoutRec(root);
    }
}
