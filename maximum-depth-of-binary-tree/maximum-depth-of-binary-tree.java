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
        maxi = 0;
        
        //edge case
        if(root == null){
            return maxi;
        }
        
        //logic
        dfs(root, 1);
        
        return maxi;
    }
    
    private void dfs(TreeNode root, int depth){
        //base case
        if(root == null){
            return;
        }
        //logic
        if(depth > maxi){
            maxi = depth;
        }
        
        dfs(root.left, depth+1);
        dfs(root.right, depth+1);
    }
}
