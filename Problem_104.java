// 104. MAximum Depth of a Binary Tree (EASY) (SOLVED - after learning, solution was in videos)
// Key ideas here = recursion due to depth first, finding the maxDepth of everything right of the current 
// node recursively. Vice versa for left. And redoing for each new node. If current node is null, it's 
// not in the tree and value is 0, then add 1 to account for current node. 

public class Problem_104 {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }
    public static void main(String[] args) {
        Problem_104 problem_104 = new Problem_104();
        TreeNode root = new TreeNode(3, 
                                        new TreeNode(9), new TreeNode(20,
                                                                            new TreeNode(15), new TreeNode(7)));
        System.out.println(problem_104.maxDepth(root));
    }
}
