package Tree;

import java.util.Stack;

class Node{
    Node left, right;
    int data;
}
class PostOrderUsingTwoStacks {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    public void postOrderUsingStacks(Node node){
        if(node == null) return;
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(node);
        while(st1.size() > 0){
            Node temp = st1.pop();
            if(temp.left != null){
                st1.push(temp.left);
            }
            if(temp.right != null){
                st1.push(temp.right);
            }
            st2.push(temp);
        }
        while(st2.size() > 0){
            System.out.print(st2.pop().data + " ");
        }
    }
    public static void main(String[] args) {
        PostOrderUsingTwoStacks a = new PostOrderUsingTwoStacks();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        a.postOrderUsingStacks(root);
    }
}
