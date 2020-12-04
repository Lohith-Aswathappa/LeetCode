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
    int result;
    public int diameterOfBinaryTree(TreeNode root) {
        //edge case
//         if(root == null){
            
//         }
        //logic
        result = 1;
        
        dfs(root);
        
        return result-1;
    }
    
    private int dfs(TreeNode root){
        //base case
        if(root == null)
            return 0;
        //logic
        int left = dfs(root.left) ;
        int right = dfs(root.right);
        result = Math.max(result, left + right + 1);
        return Math.max(left, right) + 1;
    }
}
