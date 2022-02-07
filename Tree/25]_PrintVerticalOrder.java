package Tree;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

class Node{
    Node left, right;
    int data;
}
class PrintVerticalOrder {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    public void printverticalOrder(Node node){
        if(node == null) return;
        int height = 0;

        TreeMap<Integer, ArrayList<Integer>> tm = new TreeMap<>();
        getVerticalOrder(node, height, tm);

        for (Map.Entry<Integer, ArrayList<Integer>> cm : tm.entrySet()) {
            System.out.println(cm.getValue());
          }
    }
    public void getVerticalOrder(Node node, int hd, TreeMap<Integer, ArrayList<Integer>> m) {
        if (node == null) {
          return;
        }
    
        if (m.get(hd) == null) {
          ArrayList<Integer> l = new ArrayList<Integer>();
          l.add(node.data);
          m.put(hd, l);
        } else {
          ArrayList<Integer> l = m.get(hd);
          l.add(node.data);
          m.put(hd, l);
        }
    
        getVerticalOrder(node.left, hd - 1, m);
        getVerticalOrder(node.right, hd + 1, m);
    }
    public static void main(String[] args) {
        PrintVerticalOrder a = new PrintVerticalOrder();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        a.printverticalOrder(root);
    }
}
