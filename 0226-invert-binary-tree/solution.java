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

 // Traverse each row, swap leftmost node with rightmost, then second leftmost with second right most etc.


class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        swapChildren(root);

        if(!(root.left==null)){
        invertTree(root.left); 
        }
        if(!(root.right==null)){
        invertTree(root.right);      
        }

        return root;
    }

    private TreeNode swapChildren(TreeNode root){
        if(root.left == null && root.right == null) return root;
        TreeNode leftTemp = root.left;
        root.left = root.right;
        root.right = leftTemp;

        return root;
    }
}
