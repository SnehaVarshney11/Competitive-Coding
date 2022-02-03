package Tree;

class Node{
    Node left, right;
    int data, height;
}
class PrintBoundaryView {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    public void bounaryView(Node node){
        if(node != null){
            System.out.print(node.data + " ");
            printBoundaryLeft(node.left);
            printLeafNodes(node.left);
            printLeafNodes(node.right);
            printBoundaryRight(node.right);
        }
    }

    public void printBoundaryLeft(Node node){
        if(node == null) return;

        if(node.left != null){
            System.out.print(node.data + " ");
            printBoundaryLeft(node.left);
        }else if(node.right != null){
            System.out.print(node.data + " ");
            printBoundaryLeft(node.right);
        }
    }

    public void printLeafNodes(Node node){
        if(node == null) return;
        printLeafNodes(node.left);
        if(node.left == null && node.right == null){
            System.out.print(node.data + " ");
        }
        printBoundaryLeft(node.right);
    }

    public void printBoundaryRight(Node node){
        if(node == null) return;

        if(node.right != null){
            System.out.print(node.data + " ");
            printBoundaryLeft(node.right);
        }else if(node.left != null){
            System.out.print(node.data + " ");
            printBoundaryLeft(node.left);
        }
    }
    public static void main(String[] args) {
        PrintBoundaryView a = new PrintBoundaryView();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        a.bounaryView(root);
    }
}
