package August;

class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
class DeleteNodesGreaterThanK {
    public Node deleteNode(Node root,int k)
         {
         //add code here.
            if(root == null) return root;
            
            if(root.data < k){
                root.right = deleteNode(root.right, k);
                return root;
            }else{
                root.left = deleteNode(root.left, k);
                return root.left;
            }
         }
}
