/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxi;
    public int maxDepth(TreeNode root) {
        // edge case
        if(root == null){
            return 0;
        }
        //logic
        maxi = 0;
        dfs(root, 0);
        
        return maxi+1;
    }
    
    private void dfs(TreeNode root, int depth){
        //base case
        if(root == null){
            return;
        }
        //logic
        maxi = Math.max(depth, maxi);
        dfs(root.left, depth+1);
        dfs(root.right, depth+1);
    }
}
