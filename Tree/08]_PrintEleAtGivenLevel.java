package Tree;

class Node{
    Node left, right;
    int data;
}
class PrintEleAtGivenLevel {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    public void printEleAtGivenLevel(Node root, int level){
        if(root == null){
            return;
        }
        if(level == 1){
            System.out.println(root.data + " ");
            return;
        }
        printEleAtGivenLevel(root.left, level-1);
        printEleAtGivenLevel(root.right, level-1);
    }
    public static void main(String[] args) {
        PrintEleAtGivenLevel a = new PrintEleAtGivenLevel();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        a.printEleAtGivenLevel(root, 3);
    }
}
