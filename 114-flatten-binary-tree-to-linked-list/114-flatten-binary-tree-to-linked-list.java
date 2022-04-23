/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int ;////;/;;/;/////p/p;///;/////val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public void flatten(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        preOrderTraversal( root,  queue);
        
        while(!queue.isEmpty()){
            TreeNode currNode = queue.poll();
            currNode.left = null;
            currNode.right = queue.peek();
        }
    }
    private void preOrderTraversal(TreeNode node, Queue<TreeNode> queue){
        if(node == null)
            return;
        
        queue.add(node);
        preOrderTraversal(node.left, queue);
        preOrderTraversal(node.right, queue);
    }
}