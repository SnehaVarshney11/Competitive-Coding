package Tree;

class Node{
    Node right, left;
    int data;
    
}
class Traversal {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    } 
    public void inorder(Node node){
        if(node == null)return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    public void preorder(Node node){
        if(node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }
    public void postorder(Node node){
        if(node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
    public static void main(String[] args) {
        Traversal a = new Traversal();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        //Inorder Traversal
        System.out.print("Inorder: ");
        a.inorder(root);
        System.out.println();

        //Preorder Traversal
        System.out.println("Preorder: ");
        a.preorder(root);
        System.out.println();

        //Postorder Traversal
        System.out.println("Postorder: ");
        a.postorder(root);
        System.out.println();

    }
}
