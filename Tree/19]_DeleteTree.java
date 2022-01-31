package Tree;

class Node{
    Node left, right;
    int data;
}
class DeleteTree {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    public Node deleteTree(Node node){
        if(node == null) return null;

        node.left = deleteTree(node.left);
        node.right = deleteTree(node.right);
        System.out.println("Deleting Node is: " + node.data);
        node = null;
        return node;
    }
    public static void main(String[] args) {
        DeleteTree a = new DeleteTree();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        root = a.deleteTree(root);
    }
}
