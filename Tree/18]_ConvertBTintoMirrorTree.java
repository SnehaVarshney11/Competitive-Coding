package Tree;

class Node{
    Node left, right;
    int data;
}
class ConvertBTintoMirrorTree {
    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }
    public Node mirrorTree(Node node){
        if(node == null) return null;
        Node tmp = node.left;
        node.left = node.right;
        node.right = tmp;

        mirrorTree(node.left);
        mirrorTree(node.right);

        return node;
    }
    public void inorder(Node node){
        if(node == null)return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    public static void main(String[] args) {
        ConvertBTintoMirrorTree a = new ConvertBTintoMirrorTree();
    
        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        Node mirror = a.mirrorTree(root);
        a.inorder(mirror);
    }
}
