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
    int count;
    public int kthSmallest(TreeNode root, int k) {
        //edge case
        if(root == null)
            return -1;
        //logic
        count = k;
        result = Integer.MIN_VALUE;
        dfs(root);
        
        return result;
    }
    
    private void dfs(TreeNode root){
        //base case
        if(root == null){
            return;
        }
        //logic
        dfs(root.left);
        count--;
        if(count == 0){
            result = root.val;
        }
        dfs(root.right);
    }
}
