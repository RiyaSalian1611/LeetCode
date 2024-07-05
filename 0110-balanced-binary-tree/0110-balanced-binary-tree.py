# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        
        def checkHeight(root):
            if not root:
                return -1, True
            leftHeight, is_left_balanced = checkHeight(root.left)
            if not is_left_balanced: return -1, False
            rightHeight, is_right_balanced = checkHeight(root.right)
            if not is_right_balanced: return -1, False
            is_balanced = abs(leftHeight - rightHeight) <=1
            height = max(leftHeight,rightHeight )+1
            return height, is_balanced
        
        height, is_balanced = checkHeight(root)
        return is_balanced
        
#         def checkBalance_Height(node: Optional[TreeNode]) -> (bool, int):
#             if not node:
#                 return True, -1

#             rightSubTree_balanced, rightTreeHeight = checkBalance_Height(node.right)
#             if not rightSubTree_balanced:
#                 return False, 0

#             leftSubTree_balanced, leftTreeHeight = checkBalance_Height(node.left)
#             if not leftSubTree_balanced:
#                 return False, 0

#             is_current_balanced = abs (rightTreeHeight - leftTreeHeight) <= 1
#             current_Height = max(rightTreeHeight, leftTreeHeight)+1

#             return is_current_balanced, current_Height
#         balanced, _ = checkBalance_Height(root)
        
#         return balanced

