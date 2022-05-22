import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}
class RightView{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer> al = new ArrayList<>();
        if(node == null){
            return al;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node cur = q.poll();
                if(i == size-1){
                    al.add(cur.data);
                }
                if(cur.left != null){
                    q.offer(cur.left);
                }
                if(cur.right != null){
                    q.offer(cur.right);
                }
            }
        }
        return al;
    }
}