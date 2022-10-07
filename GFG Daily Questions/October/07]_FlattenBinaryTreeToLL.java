package October;
class Node{
    Node left, right;
    int data;
}
class FlattenBinaryTreeToLL {
    public static void flatten(Node root)
    {
        //code here
        while(root != null) {
            if(root.left != null) {
                Node pred = root.left;
                while(pred.right != null) {
                    pred = pred.right;
                }
                pred.right = root.right;
                root.right = root.left;
                root.left = null;
            }
            root = root.right;
        }
    }
}
