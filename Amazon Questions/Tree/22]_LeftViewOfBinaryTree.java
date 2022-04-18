package Amazon Questions.Tree;

class LeftViewOfBinaryTree {
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> al = new ArrayList<>();
      solve(root, al);
      return al;
    }
    public void solve(Node root, ArrayList<Integer> al){
        Queue<Node> q = new LinkedList<>();
        if(root == null) return;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 1; i <= size; i++){
                Node tmp = q.poll();
                if(i == 1) al.add(tmp.data);
                
                if(tmp.left != null) q.add(tmp.left);
                if(tmp.right != null) q.add(tmp.right);
            }
        }
    }
}
