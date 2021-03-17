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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        // edge case
        if(root == null){
            return result;
        }
        //logic
        int size = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            size = q.size();
            List<Integer> res = new ArrayList<>();
            
            for(int i = 0; i < size; i++){
                TreeNode temp = q.poll();
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
                res.add(temp.val);
            }
            
            result.add(res);
        }
        return result;
    }
}