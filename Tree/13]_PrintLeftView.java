package Tree;

class Node{
    Node left, right;
    int data;
}
class PrintLeftView {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    int maxLevel;
    public void leftView(Node node, int level){
        if(node == null) return;

        if(level >= maxLevel){
            System.out.print(node.data + " ");
            maxLevel++;
        }
        leftView(node.left, level+1);
        leftView(node.right, level+1);
    }
    public static void main(String[] args) {
        PrintLeftView a = new PrintLeftView();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        a.leftView(root, 0);
    }
}
