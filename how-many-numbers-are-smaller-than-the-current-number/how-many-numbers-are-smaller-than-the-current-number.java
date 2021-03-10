class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // edge case
        if(nums == null || nums.length == 0){
            return nums;
        }
        //logic
        int[] result = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    result[i]++;
                }
            }
        }
        
        return result;
    }
}