import java.util.ArrayList;

class Node  
{ 
    int data; 
    Node left, right;
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}
class BoundaryTraversalOfBT {
    boolean isLeaf(Node node) {
        if (node == null)
            return false;    
        if (node.right == null && node.left == null)
            return true;
        return false;   
    }
    void addLeftBoundary(Node node, ArrayList<Integer> res){
        Node cur = node.left;
        while(cur != null){
            if(isLeaf(cur) == false){
                res.add(cur.data);
            }
            if(cur.left != null) cur = cur.left;
            else cur = cur.right;
        }
    }
    void addLeafNode(Node node, ArrayList<Integer> res){
        if(isLeaf(node)){
            res.add(node.data);
            return;
        }
        if(node.left != null){
            addLeafNode(node.left, res);
        }
        if(node.right != null){
            addLeafNode(node.right, res);
        }
    }
    void addRightBoundary(Node node, ArrayList<Integer> res){
        Node cur = node.right;
        ArrayList<Integer> tmp = new ArrayList<>();
        while(cur != null){
            if(isLeaf(cur) == false){
                tmp.add(cur.data);
            }
            if(cur.right != null) cur = cur.right;
            else cur = cur.left;
        }
        for(int i = tmp.size()-1; i >= 0; i--){
            res.add(tmp.get(i));
        }
    }
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer> al = new ArrayList<>();
	    if(node == null) return al;
	    if(isLeaf(node) == false){
	        al.add(node.data);
	    }
	    addLeftBoundary(node, al);
	    addLeafNode(node, al);
	    addRightBoundary(node, al);
	    
	    return al;
	}
}
