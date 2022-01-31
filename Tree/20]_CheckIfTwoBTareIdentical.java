package Tree;

class Node{
    Node left, right;
    int data;
}
class CheckIfTwoBTareIdentical {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    public boolean checkIdentical(Node node1, Node node2){
        if(node1 == null && node2 == null){
            return true;
        }
        if(node1 == null || node2 == null){
            return false;
        }
        return node1.data == node2.data && checkIdentical(node1.left, node2.left) && checkIdentical(node1.right, node2.right);
    }
    public static void main(String[] args) {
        CheckIfTwoBTareIdentical a = new CheckIfTwoBTareIdentical();
    
        Node root1 = a.createNode(2);
        root1.left = a.createNode(7);
        root1.right = a.createNode(5);
        root1.left.left = a.createNode(2);
        root1.left.right = a.createNode(6);
        root1.left.right.left = a.createNode(5);
        root1.left.right.right = a.createNode(11);
        root1.right.right = a.createNode(9);
        root1.right.right.left = a.createNode(4);

        Node root2 = a.createNode(2);
        root2.left = a.createNode(7);
        root2.right = a.createNode(5);
        root2.left.left = a.createNode(2);
        root2.left.right = a.createNode(6);
        root2.left.right.left = a.createNode(5);
        root2.left.right.right = a.createNode(11);
        root2.right.right = a.createNode(9);
        root2.right.right.left = a.createNode(4);

        System.out.println(a.checkIdentical(root1, root2));
    }
}
