class Solution {
    public int maxProduct(int[] nums) {
        //edge case
        if(nums == null || nums.length == 0)
            return -1;
        //logic
        int maxS = nums[0];
        int minS = nums[0];
        int curr = -1;
        int result = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            curr = nums[i];
            
            int temp = Math.max(curr, Math.max(maxS * curr, minS * curr));
            minS = Math.min(curr, Math.min(minS * curr, maxS * curr));
            
            maxS = temp;
            
            result = Math.max(result, maxS);
        }
        
        return result;
    }
}