package Amazon Questions.Tree;

class KdistancefromRoot {
    ArrayList<Integer> Kdistance(Node root, int k)
     {
          // Your code here
          ArrayList<Integer> al = new ArrayList<>();
          helper(root, k, al);
          return al;
     }
     void helper(Node root, int k, ArrayList<Integer> al){
         if(root == null || k < 0) return;
         if(k == 0) al.add(root.data);
         helper(root.left, k-1, al);
         helper(root.right, k-1, al);
     }
}
