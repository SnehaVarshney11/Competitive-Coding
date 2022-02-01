package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class Node{
    Node left, right;
    int data, height;
}
class PrintTopView {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    public void topView(Node root){
        if(root == null) return;

        TreeMap<Integer, Integer> tm = new TreeMap<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node temp = q.remove();
            int hd = temp.height;
            if(tm.get(hd) == null){
                tm.put(hd, temp.data);
            }
            if(temp.left != null){
                temp.left.height = hd-1;
                q.add(temp.left);
            }
            if(temp.right != null){
                temp.right.height = hd+1;
                q.add(temp.right);
            }
        }
        System.out.println(tm.values());
    }
    public static void main(String[] args) {
        PrintTopView a = new PrintTopView();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        a.topView(root);
    }
}
