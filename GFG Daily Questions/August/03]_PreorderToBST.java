package August;

class Node{
    int data;
    Node left, right;
    Node(int d){
        data = d;
    }
}
class PreorderToBST {
    public static Node post_order(int pre[], int size) {

        Node root = makeBST(pre, 0, size);
        return root;
    } 
    public static Node makeBST(int[] pre, int i, int s){
        if(i>=s)
            return null;
        Node node = new Node(pre[i]);
        int j=i+1;
        for(j=i+1; j<s; j++){
            if(pre[j]>pre[i])
                break;
        }
        node.left = makeBST(pre, i+1, j);
        node.right = makeBST(pre, j, s);
        return node;
    }
}
