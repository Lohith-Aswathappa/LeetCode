class Solution {
    public int[] twoSum(int[] nums, int target) {
        //edge case
        if(nums == null || nums.length == 0){
            return new int[]{-1,-1};
        }
        //logic
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        
        return new int[]{-1,-1};
    }
}
