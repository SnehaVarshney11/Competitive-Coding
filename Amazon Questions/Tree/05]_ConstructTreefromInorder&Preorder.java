/* First traverse preorder
if the root of preorder is present in inorder then the left most element 
of root are in left and right most elements are in right

Put the value of inorder in map 
create a map and put the root value of preorder
check the value of root, where it is present in map   
now find left elements by the subtraction of root and in_start
    */

class ConstructTreefromInorderPreorder{
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(inorder[i], i);
        }
        return helper(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, map);
    }
    static Node helper(int[] preorder, int pre_start, int pre_end, 
    int[] inorder, int in_start, int in_end, Map<Integer, Integer> map){
        if(in_start > in_end || pre_start > pre_end) return null;
        Node node = new Node(preorder[pre_start]);
        
        int in_root = map.get(node.data);
        int left = in_root - in_start;
        
        node.left = helper(preorder, pre_start+1, pre_start+left, inorder, 
        in_start, in_root-1, map);
        
        node.right = helper(preorder, pre_start+left+1, pre_end,
        inorder, in_root+1, in_end, map);
        
        return node;
    }
}