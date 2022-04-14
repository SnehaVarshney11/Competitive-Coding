package Amazon Questions.Tree;

class SumOfLeftLeafNodes {
    public boolean isLeafNode(Node node){
        if(node == null) return false;
        if(node.left == null && node.right == null) return true;
        
        return false;
    }
    public int leftLeavesSum(Node root) 
    { 
        // Write your code here
        int sum = 0;
        if(root != null){
            if(isLeafNode(root.left)){
                sum += root.left.data;
            }else{
                sum += leftLeavesSum(root.left);
            }
            sum += leftLeavesSum(root.right);
        }
        return sum;
    } 
}
