import java.util.LinkedList;
import java.util.Queue;

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
class MaximumWidthOfTree {
    int getMaxWidth(Node root) {
        // Your code here
        int max = 0;
        if(root == null) return 0;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            max = Math.max(max, size);
            for(int i = 0; i < size; i++){
                Node cur = q.poll();
                if(cur.left != null){
                    q.offer(cur.left);
                }
                if(cur.right != null){
                    q.offer(cur.right);
                }
            }
        }
        return max;
    }
}
