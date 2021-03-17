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
    int depth;
    public int maxDepth(TreeNode root) {
        depth = 0;
        if(root == null){
            return depth;
        }
        dfs(root, 0);
        return depth+1;
    }
    
    private void dfs(TreeNode root, int level){
        //base case
        if(root == null){
            return;
        }
        //logic
        depth = Math.max(depth, level);
        
        dfs(root.left,level+1);
        dfs(root.right, level+1);
    }
}