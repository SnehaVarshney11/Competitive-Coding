package September;

class Node {
    int data;
    Node left, right;
    Node(int key){
        this.data = key;
        this.left = this.right = null;
    }
}
class SumOfKSmallestElementsInBST {
    int sum(Node root, int k) { 
        
        // Code here
        this.p=k;
        func(root);
        
        return sum;
    } 
    int sum=0,p=0;
    void func(Node root){
        if(root==null) return;
        func(root.left);
        if(p>0){
            this.sum+=root.data;
            p--;
        }
        func(root.right);
    }
}
