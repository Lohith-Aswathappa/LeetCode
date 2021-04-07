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
    int mini;
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        mini = Integer.MAX_VALUE;
        
        helper(root,1);
        return mini;
    }
    
    private void helper(TreeNode root, int depth){
        //base case
        if(root == null){
            return;
        }
        //logic
        if(root.left == null && root.right == null){
            mini = Math.min(depth, mini);
        }
        helper(root.right, depth+1);
        helper(root.left, depth+1);
    }
}