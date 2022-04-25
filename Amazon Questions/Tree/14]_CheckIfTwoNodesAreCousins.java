package Amazon Questions.Tree;

class CheckIfTwoNodesAreCousins {
    public boolean isCousins(Node root, int a, int b) {
        // your code here
        // This function should return true if x and y are cousins, else return false
        //Base Condition
        if(root == null) return false;
        if(a == b) return false;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            boolean isA = false;
            boolean isB = false;
            
            for(int i = 0; i < size; i++){
                Node cur = q.poll();
                if(cur.data == a) isA = true;
                if(cur.data == b) isB = true;
                
                if(cur.left != null && cur.right != null){
                    if(cur.left.data == a && cur.right.data == b)
                        return false;
                    if(cur.left.data == b && cur.right.data == a)
                        return false;
                }
                if(cur.left != null)
                    q.offer(cur.left);
                if(cur.right != null)
                    q.offer(cur.right);
                    
            }
            if(isA && isB)
                return true;
        }
         return false;
    }
}
