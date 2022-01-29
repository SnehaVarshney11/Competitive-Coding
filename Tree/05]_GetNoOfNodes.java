package Tree;

class Node{
    Node left, right;
    int data;
}
class GetNoOfNodes {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    public int getNodes(Node root){
        if(root == null){
            return 0;
        }
        return 1 + getNodes(root.right) + getNodes(root.left);
    }
    public static void main(String[] args) {
        GetNoOfNodes a = new GetNoOfNodes();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        System.out.println("Total number of node is: " + a.getNodes(root));
    }
}
