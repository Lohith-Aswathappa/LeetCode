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
    public List<Integer> inorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        
        // edge case
        if(root == null){
            return result;
        }
        //logic
        
        inorder(root);
        return result;
    }
    
    private void inorder(TreeNode root){
        //base case
        if(root == null){
            return;
        }
        //logic
        inorder(root.left);
        result.add(root.val);
        inorder(root.right);
    }
}