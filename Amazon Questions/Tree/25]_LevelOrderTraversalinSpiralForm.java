package Amazon Questions.Tree;

class LevelOrderTraversalinSpiralForm {
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        ArrayList<Integer> al = new ArrayList<>();
        if(root == null) return al;
        
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s2.add(root);
        
        while(!s1.isEmpty() || !s2.isEmpty()){
            while(!s1.isEmpty()){
                Node val = s1.pop();
                al.add(val.data);
                if(val.left != null){
                    s2.add(val.left);
                }
                if(val.right != null){
                    s2.add(val.right);
                }
            }
            while(!s2.isEmpty()){
                Node val = s2.pop();
                al.add(val.data);
                if(val.right != null){
                    s1.add(val.right);
                }
                if(val.left != null){
                    s1.add(val.left);
                }
            }
        }
        return al;
    }
}
