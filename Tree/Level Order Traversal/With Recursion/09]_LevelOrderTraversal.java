class Node{
    Node left, right;
    int data;
}
class LevelOrderTraversal {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    
    public void levelOrderTraversal(Node node){
        if(node == null) return;
        int height = getHeight(node);

        for(int i = 0; i <= height; i++){
            printEleAtGivenLevel(node, i+1);
            System.out.println();
        }
    }
    public int getHeight(Node root){
        if(root == null){
            return -1;
        }
        return Math.max(getHeight(root.right), getHeight(root.left)) + 1;
    }
    public void printEleAtGivenLevel(Node root, int level){
        if(root == null){
            return;
        }
        if(level == 1){
            System.out.print(root.data + " ");
            return;
        }
        printEleAtGivenLevel(root.left, level-1);
        printEleAtGivenLevel(root.right, level-1);
    }
    public static void main(String[] args) {
        LevelOrderTraversal a = new LevelOrderTraversal();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        a.levelOrderTraversal(root);
    }
}
