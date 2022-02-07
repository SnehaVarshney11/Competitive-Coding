package Tree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    Node left, right;
    int data;
}
class GetSumOfElementsLevelWise {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    public void printSumLevelWise(Node node){
        if(node == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while(true){
            int size = q.size();
            if(size == 0){
                break;
            }

            int sum = 0;
            while(size > 0){
                Node t = q.remove();
                sum = sum + t.data;

                if(t.left != null){
                    q.add(t.left);
                }
                if(t.right != null){
                    q.add(t.right);
                }
                size--;
            }
            System.out.println(sum);
        }
        return;
    }
    public static void main(String[] args) {
        GetSumOfElementsLevelWise a = new GetSumOfElementsLevelWise();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        a.printSumLevelWise(root);
    }
}
