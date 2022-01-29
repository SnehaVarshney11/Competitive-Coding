package Tree;

class Node {
    Node left, right;
    int data;
}

class GetSumOfAllNodes {
    public Node createNode(int val) {
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }

    public int getSum(Node root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        sum += root.data + getSum(root.left) + getSum(root.right);
        return sum;
    }

    public static void main(String[] args) {
        GetSumOfAllNodes a = new GetSumOfAllNodes();

        Node root = a.createNode(2);
        root.left = a.createNode(7);
        root.right = a.createNode(5);
        root.left.left = a.createNode(2);
        root.left.right = a.createNode(6);
        root.left.right.left = a.createNode(5);
        root.left.right.right = a.createNode(11);
        root.right.right = a.createNode(9);
        root.right.right.left = a.createNode(4);

        System.out.println("Sum of all node is: " + a.getSum(root));
    }
}
