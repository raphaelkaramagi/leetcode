// 100. Same Tree (EASY) (SOLVED)

public class Problem_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null) return true;
        if((p == null) && (q != null)) return false;
        if((q == null) && (p!=null)) return false;
        if(p.val != q.val) return false;

        boolean result = isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        return result;
    }
}   
