package Leetcode.JulyDailyQues;

class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;
        return buildTree(preorder, inorder, 0, 0, inorder.length - 1);
    }
    
    private TreeNode buildTree(int[] preorder, int[] inorder, int preorderIndex, int start, int end) {
        if (start > end) return null;
        TreeNode node = new TreeNode(preorder[preorderIndex]);
        int inorderIndex = findInorderIndex(inorder, start, end, preorder[preorderIndex]);
        int leftTreeSize = inorderIndex - start;
        node.left = buildTree(preorder, inorder, preorderIndex + 1, start, inorderIndex - 1);
        node.right = buildTree(preorder, inorder, preorderIndex + leftTreeSize + 1, inorderIndex + 1, end);
        return node;
    }
    
    private int findInorderIndex(int[] inorder, int start, int end, int key) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == key) return i;
        }
        return -1;
    }
}