import java.util.ArrayList;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class LeftViewOfBinaryTree {
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> al = new ArrayList<>();
      leftV(root, al, 0);
      return al;
    }
    public void leftV(Node root, ArrayList<Integer> al, int level){
        if(root == null) return;
        if(al.size() == level)
            al.add(root.data);
        leftV(root.left, al, level+1);
        leftV(root.right, al, level+1);
    }
}
