// 102. Level Order (MEDIUM) (SOLVED )
// new concpet so learned algorithm from video, added comments and understood

import java.util.*;

public class Problem_102 {

    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        // Use of a queue (FIFO)
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            // Get the size of the current level (size of queue)
            int levelSize = queue.size();

            // Prepare a list to store the values of the nodes at the current level
            List<Integer> currentLevel = new ArrayList<>();

            // Loop repeats for each Node in the current level
            for (int i = 0; i < levelSize; i++) {
                // Current node dequeued,  which was the first thing added to the quoue (left to right) - at the front
                TreeNode currentNode = queue.poll();
                // Anything on current level is added, unless null. It's note has already been polled from queue
                currentLevel.add(currentNode.val);

                // Enqueue the children for the next level.
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }

    public static void main(String[] args) {
        Problem_102 problem_102 = new Problem_102();
        TreeNode root = new TreeNode(4, 
                                        new TreeNode(2,
                                        new TreeNode(1), new TreeNode(3)), 
                                            new TreeNode(7,
                                            new TreeNode(6), new TreeNode(9)));
        System.out.println(problem_102.levelOrder(root));
    }
    
}
