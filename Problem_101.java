public class Problem_101 {
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

    public static void main(String[] args) {
        Problem_101 problem_101 = new Problem_101();
        TreeNode root = new TreeNode(3, 
                                        new TreeNode(9), new TreeNode(20,
                                                                            new TreeNode(15), new TreeNode(7)));
        System.out.println(problem_101.isSymmetric(root));
    }

}
