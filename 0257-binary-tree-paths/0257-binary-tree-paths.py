# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def backtrack(self, node, pathTillNow):
        if not (node.right or node.left):
            self.paths.append("->".join(pathTillNow))

        if node.left:
            self.backtrack(node.left, pathTillNow + [str(node.left.val)])
            
        if node.right:
            self.backtrack(node.right, pathTillNow + [str(node.right.val)])

    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        
        self.paths = []
        self.backtrack(root, [str(root.val)])
        return self.paths
