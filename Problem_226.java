// Problem 226. Invert Binary Tree (EASY) (SOLVED) 
// My own full implementation. Worked!

public class Problem_226 {

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

    public static void main(String[] args) {
        Problem_226 problem_102 = new Problem_226();
        TreeNode root = new TreeNode(4, 
                                        new TreeNode(2,
                                        new TreeNode(1), new TreeNode(3)), 
                                            new TreeNode(7,
                                            new TreeNode(6), new TreeNode(9)));
        System.out.println(problem_102.invertTree(root));
    }
    
}
