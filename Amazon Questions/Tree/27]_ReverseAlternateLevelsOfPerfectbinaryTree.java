package Amazon Questions.Tree;

class ReverseAlternateLevelsOfPerfectbinaryTree {
    static void reverseAlternate( Node root)  
    {  
       // code here.
       Queue<Node> q = new LinkedList<>();
       q.add(root);
       int level = 0;
       while(!q.isEmpty()){
           int size = q.size();
           Stack<Integer> st = new Stack<>();
           for(int i = 0; i < size; i++){
               Node cur = q.poll();
               if(cur.left != null){
                   q.add(cur.left);
                   st.push(cur.left.data);
               }
               if(cur.right != null){
                   q.add(cur.right);
                   st.push(cur.right.data);
               }
           }
           if(level % 2 == 0){
               for(Node n : q){
                   n.data = st.pop();
               }
           }
           level++;
       }
    }  
}
