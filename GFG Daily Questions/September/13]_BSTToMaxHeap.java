package September;

import java.util.ArrayList;

class Node{
    Node left, right;
    int data;
}
class BSTToMaxHeap {
    static ArrayList<Integer> al = new ArrayList<>();
    static int i = 0;
    
    public static void InorderTrav(Node root){
        if(root == null) return;
        InorderTrav(root.left);
        al.add(root.data);
        InorderTrav(root.right);
    }
    
    public static void PreorderTrav(Node root){
        if(root == null) return;
        PreorderTrav(root.left);
        PreorderTrav(root.right);
        root.data = al.get(i);
        i++;
    }
    
    public static void convertToMaxHeapUtil(Node root)
    {
        //code here
        InorderTrav(root);
        PreorderTrav(root);
    }
}
