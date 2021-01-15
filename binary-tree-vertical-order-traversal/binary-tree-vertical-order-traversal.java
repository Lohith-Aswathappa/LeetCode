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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        //edge case
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        
        //logic
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        Queue<Integer> cols = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        int max = 0;
        int min = 0;
        q.add(root);
        cols.add(0);
        
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            int col = cols.poll();
            if(!map.containsKey(col)){
                map.put(col, new ArrayList<>());
            }
            map.get(col).add(temp.val);
            
            if(temp.left != null){
