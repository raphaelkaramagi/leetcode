# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        # Initial idea, just so a DFS traversal - in this case pre order, into an array/string, and check if the subroot is in the serialized
        def serialize(node: Optional[TreeNode]) -> str:
            if not node:
                return ",#"
            # Pre-order: delimiter + val + left + right
            return f",{node.val}" + serialize(node.left) + serialize(node.right)

        return serialize(subRoot) in serialize(root)
            

    
        
