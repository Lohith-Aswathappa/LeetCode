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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0)
            return null;
        
        return construct(nums, 0, nums.length - 1);
    }
    
    private TreeNode construct(int[] nums, int start, int end){
        //edge case
        if(start > end)
            return null;
        
        //logic
        int mid = start + (end - start) / 2;
        
        TreeNode root = new TreeNode(nums[mid]);
        root.left = construct(nums, start, mid-1);
        root.right = construct(nums, mid+1, end);
        
        return root;
    }
}
