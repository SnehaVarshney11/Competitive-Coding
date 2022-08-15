package August;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
class NumberOfTurnsInBinaryTree {
    static Node parent(Node root,int first,int second)
    {
        if(root == null) return null;
        else if(root.data == first || root.data == second) return root;
        Node left = parent(root.left,first,second);
        Node right = parent(root.right,first,second);
        if(left !=null && right != null) return root;
        return left == null?right:left;
    }
    //Prev Direction :- left = true, right = false
    static int search(Node root,boolean prevDir,int first,int second,int turn)
    {
        if(root == null) return 0;
        else if (root.data == first || root.data == second) return turn;
        int res = 0, leftTurn = 0, rightTurn = 0;
        if(prevDir) rightTurn = 1;
        else leftTurn = 1;
        res += search(root.left,true,first,second,turn+leftTurn);
        res += search(root.right,false,first,second,turn+rightTurn);
       return res;
    }
    static int NumberOfTurns(Node root, int first, int second)
    {
        root = parent(root,first,second);
        int res = 0;
        res += search(root.left,true,first,second,0);
        res += search(root.right,false,first,second,0);
        if(root.data != first && root.data != second)
        res+=1;
        return res;
    }
}
