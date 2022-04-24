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
    HashMap<Integer, Integer> map = new HashMap();
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0; i< inorder.length; i++){
            map.put(inorder[i], i);
        }
     return construct(preorder, inorder, 0, inorder.length -1);
    }
    
    private TreeNode construct(int[] preorder, int[] inorder, int start, int end) {
       if(start > end)
           return null;
        TreeNode root = new TreeNode(preorder[preIndex++]);
        if(root == null)
            return null;
        
        if(start == end)
            return root;
        
        int index = map.get(root.val);
        
        root.left = construct(preorder, inorder, start, index-1);
        root.right = construct(preorder, inorder, index + 1, end);
        
        return root;
    }
    
}