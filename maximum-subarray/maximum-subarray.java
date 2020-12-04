class Solution {
    public int maxSubArray(int[] nums) {
        //edge case
        if(nums == null || nums.length == 0)
            return 0;
        //logic
        int curr = nums[0];
        int maxi = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            curr = Math.max(nums[i], curr+nums[i]);
            maxi = Math.max(curr, maxi);
        }
        
        return maxi;
    }
}
