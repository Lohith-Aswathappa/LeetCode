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
    List<Integer> result;
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        //edge case
        
        //logic
        result = new ArrayList<>();
        helper(root1);
        helper(root2);
        
        Collections.sort(result);
        
        return result;
    }
    
    private void helper(TreeNode root){
        //base case
        if(root == null){
            return;
        }
        //logic
        result.add(root.val);
        helper(root.left);
        helper(root.right);
    }
}