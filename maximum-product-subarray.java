class Solution {
    public int maxProduct(int[] nums) {
        //edge case
        if(nums == null || nums.length == 0)
            return 0;
        
        //logic
        int max_so_far = nums[0];
        int min_so_far = nums[0];
        int result = max_so_far;
        
        for(int i = 1; i < nums.length; i++){
            int curr = nums[i];
            int temp = Math.max(curr, Math.max(min_so_far * curr, max_so_far * curr));
            min_so_far = Math.min(curr, Math.min(min_so_far * curr, max_so_far * curr));
        
            max_so_far = temp;
            
            result = Math.max(max_so_far, result);
            }
        return result;
    }
}
