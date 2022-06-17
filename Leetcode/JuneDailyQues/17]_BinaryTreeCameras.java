package Leetcode.JuneDailyQues;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class BinaryTreeCameras{
    int no_of_camera = 0;
    public int minCameraCover(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int res = findCamera(root);
        
        if(res == -1){
            no_of_camera++;
        }
        return no_of_camera;
    }
    
    public int findCamera(TreeNode root){
        if(root == null) return 1;
        
        int left = findCamera(root.left);
        int right = findCamera(root.right);
        
        //when we find camera
        if(left == -1 || right == -1){
            no_of_camera++;
            return 0;
        }
        if(left == 0 || right == 0){
            return 1;
        }
        return -1;
    }
}