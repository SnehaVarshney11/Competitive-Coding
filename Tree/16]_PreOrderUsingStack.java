package Tree;

import java.util.Stack;

class Node{
    Node left, right;
    int data;
}
class PreOrderUsingStack {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    public void preOrderUsingStack(Node node){
        if(node == null) return;
        Stack<Node> st = new Stack<Node>();
        st.push(node);
        while(st.size() > 0){
            Node temp = st.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null){
                st.push(temp.right);
            }
            if(temp.left != null){
                st.push(temp.left);
            }
        }
    }
    public static void main(String[] args) {
        PreOrderUsingStack a = new PreOrderUsingStack();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        a.preOrderUsingStack(root);
    }
}
