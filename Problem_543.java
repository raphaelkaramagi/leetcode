public class Problem_543 {

    public int diameterOfBinaryTree(TreeNode root) {
        // It's EVERY node that has no children
        int count = 0;
        if(root==null) return count+=0;

        if(hasChildren(root) == false) count++;

        diameterOfBinaryTree(root.left);   
        diameterOfBinaryTree(root.right); 

        return count;
    }
    private boolean hasChildren(TreeNode root){
        if((root.left == null)&&(root.right==null)) return false;
        return true;
    }

    public static void main(String[] args) {
        Problem_543 problem_543 = new Problem_543();
        TreeNode root = new TreeNode(3, 
                                        new TreeNode(9), new TreeNode(20,
                                                                            new TreeNode(15), new TreeNode(7)));
        System.out.println(problem_543.diameterOfBinaryTree(root));
    }
}
