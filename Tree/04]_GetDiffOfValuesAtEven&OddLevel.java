package Tree;

class Node{
    Node left, right;
    int data;
}
class GetDiffOfValuesAtEvenOddLevel {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    public int getDiff(Node node){
        if(node == null){
            return 0;
        }
        int diff = node.data - getDiff(node.left) - getDiff(node.right);
        return diff;
    }
    public static void main(String[] args) {
        GetDiffOfValuesAtEvenOddLevel a = new GetDiffOfValuesAtEvenOddLevel();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        System.out.println("Difference is: " + a.getDiff(root));
    }
}
