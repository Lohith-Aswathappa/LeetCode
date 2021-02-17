class Solution {
    public int missingNumber(int[] nums) {
        // edge case
        if(nums == null || nums.length == 0){
            return nums.length;
        }
        //logic
        //sort
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        
        return nums.length;
    }
}