package Amazon Questions.Tree;

class LevelOrderTraversalLineByLine {
    //Function to return the level order traversal line by line of a tree.
    static ArrayList<ArrayList<Integer>> levelOrder(Node node) 
    {
        // Your code here
        Queue<Node> q = new LinkedList<Node>();
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        q.offer(node);
        
        while(!q.isEmpty()){
            int level_num = q.size();
            ArrayList<Integer> list = new ArrayList<Integer>(); 
            for(int i = 0; i < level_num; i++){
                if(q.peek().left != null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right != null){
                    q.offer(q.peek().right);
                }
                list.add(q.poll().data);
            }
            al.add(list);
        }
        return al;
    }
}
