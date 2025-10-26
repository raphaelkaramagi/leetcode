/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        // for every node, swap its children, if it has them
        if(root == null) return null;
        if(root.left == null && root.right == null) return root; 

        TreeNode tempLeft = root.left;
        root.left =  root.right;
        root.right = tempLeft;

        if(root.left != null) invertTree(root.left);
        if (root.right!=null) invertTree(root.right);

    return root;
    }

}
