package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class Node{
    Node left, right;
    int data, height;
}
class BottomView {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    public void bottomView(Node node){
        if(node == null) return;

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while(!q.isEmpty()){
            Node tmp = q.remove();
            int h = tmp.height;
            treeMap.put(h, tmp.data);

            if(tmp.left != null){
                tmp.left.height = h-1;
                q.add(tmp.left);
            }
            if(tmp.right != null){
                tmp.right.height = h+1;
                q.add(tmp.right);
            }
        }
        System.out.println(treeMap.values());
    }
    public static void main(String[] args) {
        BottomView a = new BottomView();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        a.bottomView(root);
    }
}
