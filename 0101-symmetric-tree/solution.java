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
    public boolean isSymmetric(TreeNode root) {
        // base case
        if(root==null) return true;
        
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode tree1, TreeNode tree2){
        // Base case: if both are null, they are mirrors
        if(tree1 == null && tree2 == null) return true;
        // Base case: if one is null, they aren't mirrors
        if(tree1==null || tree2 == null) return false;
        

        return (tree1.val == tree2.val) && isMirror(tree1.left, tree2.right) && isMirror(tree1.right, tree2.left);
    }
    

}
