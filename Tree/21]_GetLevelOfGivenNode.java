package Tree;

class Node{
    Node left, right;
    int data;
}
class GetLevelOfGivenNode {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    public int getLevel(Node node, int val, int level){
        if(node == null) return 0;
        int l;

        if(node.data == val) return level;

        l = getLevel(node.left, val, level+1);

        if(l != 0) return l;

        l = getLevel(node.right, val, level+1);
        return l;
    }
    public static void main(String[] args) {
        GetLevelOfGivenNode a = new GetLevelOfGivenNode();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        System.out.println(a.getLevel(root, 2, 1));
    }
}
