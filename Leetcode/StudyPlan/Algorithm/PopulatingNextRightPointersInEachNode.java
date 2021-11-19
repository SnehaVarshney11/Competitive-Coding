package StudyPlan.Algorithm;

class Node{
    Node left, right,next; 
}
public class PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        if(root == null)
            return null;
        //Check for left to right
        if(root.left != null)
            root.left.next = root.right;
        //Check for left to right to next
        if(root.right != null && root.next != null)
            root.right.next = root.next.left;
        
        //call the function for left and right
        connect(root.left);
        connect(root.right);
        return root;
    }
}
