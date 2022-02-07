package Tree;

import java.util.Map;
import java.util.TreeMap;

class Node{
    Node left, right;
    int data;
}
class GetVerticalSum {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    public void getVerticalSum(Node node){
        if(node == null) return;

        Map<Integer, Integer> map = new TreeMap<>();

        vertcalSum(node, 0, map);
        if(map != null){
            System.out.println(map.values());
        }
    }
    public void vertcalSum(Node node, int val, Map<Integer, Integer> map){
        if(node == null) return;

        vertcalSum(node.left, val-1 , map);

        int sum = (map.get(val) == null ) ? 0 : map.get(val);
        map.put(val, sum + node.data);

        vertcalSum(node.right, val+1, map);
    }
    public static void main(String[] args) {
        GetVerticalSum a = new GetVerticalSum();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        a.getVerticalSum(root);
    }
}
