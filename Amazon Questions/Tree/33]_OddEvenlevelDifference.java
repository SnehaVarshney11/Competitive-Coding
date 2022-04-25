package Amazon Questions.Tree;

class OddEvenlevelDifference {
    int getLevelDiff(Node root)
	{
	    //code here
	    if(root == null) return 0;
	    Queue<Node> q = new LinkedList<>();
	    q.offer(root);
	    int level = 0;
	    int odd_sum = 0, even_sum = 0;
	    
	    while(!q.isEmpty()){
	        int size = q.size();
	        level++;
	        
	        while(size > 0){
	            Node tmp = q.remove();
	            if(level % 2 == 0){
	                even_sum += tmp.data;
	            }else{
	                odd_sum += tmp.data;
	            }
	            if(tmp.left != null){
	                q.offer(tmp.left);
	            }
	            if(tmp.right != null){
	                q.offer(tmp.right);
	            }
	            size--;
	        }
	    }
	    return (odd_sum - even_sum);
	}
}
