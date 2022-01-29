package Tree;

class Node{
    Node left, right;
    int data;
}
class GetHeight {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    public int getHeight(Node root){
        if(root == null){
            return -1;
        }
        return Math.max(getHeight(root.right), getHeight(root.left)) + 1;
    }
    public static void main(String[] args) {
        GetHeight a = new GetHeight();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        System.out.println("Height of binary tree is: " + a.getHeight(root));
    }
}
