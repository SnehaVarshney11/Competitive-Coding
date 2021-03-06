package NovDailyQues;

class Node{
    Node left, right;
    int val;
}
class DeleteNodeInBST {
    public Node deleteNode(Node root, int key) {
        //Base Cond.
        if(root == null)
            return root;
        
        if(key < root.val){
            root.left = deleteNode(root.left, key);
            return root;
        } 
        else if(key > root.val){
            root.right = deleteNode(root.right, key);
            return root;
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }else{
                Node min = root.right;
                while(min.left != null){
                    min = min.left;
                }
                root.val = min.val;
                root.right = deleteNode(root.right, min.val);
                return root;
            }
        }
    }    
}
