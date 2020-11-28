class Solution {
    public int maxSubArray(int[] nums) {
        //edge case
        if(nums == null || nums.length == 0)
            return 0;
        
        //logic
        int maximum = nums[0];
        int curr = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            curr = Math.max(nums[i], curr+nums[i]);
            maximum = Math.max(maximum, curr);
        }
        
        return maximum;
    }
}
