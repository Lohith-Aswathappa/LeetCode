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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        
        //edge case
        if(root == null)
            return result;
        
        //logic
        helper(root, result);
        
        return result;
    }
    
    private void helper(TreeNode root, List<Integer> result){
        //edge case
        if(root == null)
            return;
        //logic
        helper(root.left, result);
        helper(root.right, result);
        result.add(root.val);
    }
}