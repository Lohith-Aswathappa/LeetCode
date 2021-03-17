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
    TreeNode prev;
    TreeNode first;
    
    public boolean isValidBST(TreeNode root) {
        //edge case
        if(root == null){
            return true;
        }
        //logic
        dfs(root);
        
        //return
        if(first == null){
            return true;
        }
        
        return false;
    }
    
    private void dfs(TreeNode root){
        //base
        if(root == null){
            return;
        }
        //logic
        
        dfs(root.left);
        if(prev != null && root.val <= prev.val){
            first = root;
        }
        prev = root;
        dfs(root.right);
    }
}