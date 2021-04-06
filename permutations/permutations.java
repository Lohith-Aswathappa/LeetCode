class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>(); 
        
        helper(nums, new ArrayList<>());
        
        return res;
    }
    
    
    private void helper(int[] nums, ArrayList<Integer> result){
        //base case
        if(result.size() == nums.length){
            res.add(new ArrayList<>(result));
            return;
        }
        //logic
        for(int i = 0; i < nums.length; i++){
            if(!result.contains(nums[i])){
                result.add(nums[i]);
                helper(nums, result);
                result.remove(result.size()-1);
            }
        }
    }
}