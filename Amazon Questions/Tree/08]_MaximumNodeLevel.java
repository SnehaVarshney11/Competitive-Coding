import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node left,right;
	
	Node(int item)
	{
	    data = item;
	    left = right = null;
	}
}
class MaximumNodeLevel {
    public static int maxNodeLevel(Node root)
    {
        // add your code here
        Queue<Node> q = new LinkedList<>();
        int res = 0, level = 0;
        int max =  Integer.MIN_VALUE;
        
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node node = q.poll();
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            
            if(size > max){
                max = size;
                res = level;
            }
            level++;
        }
        return res;
    }
}
