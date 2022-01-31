package Tree;

import java.util.Stack;

class Node{
    Node left, right;
    int data;
}
class InorderUsingStack {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    public void inoderUsingStack(Node node){
        if(node == null) return;
        Stack<Node> st = new Stack<>();
        while(node != null){
            st.push(node);
            node = node.left;
        }
        while(st.size() > 0){
            Node temp = st.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null){
                Node tmp = temp.right;
                while(tmp != null){
                    st.push(tmp);
                    tmp = tmp.left;
                }
            }
        }
    }
    public static void main(String[] args) {
        InorderUsingStack a = new InorderUsingStack();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        a.inoderUsingStack(root);
    }
}
