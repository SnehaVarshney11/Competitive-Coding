package DecDailyQues;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
    class PopulatingNextRightPointersInEachNode {
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
}
