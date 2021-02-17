class Solution {
    public int missingNumber(int[] nums) {
        // edge case
        if(nums == null || nums.length == 0){
            return nums.length;
        }
        //logic
        
        //sort
        /*Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        
        int[] result = new int[nums.length+1];
        
        for(int i = 0; i < nums.length; i++){
            result[nums[i]] = 1;
        }
        
        for(int i = 0; i < result.length; i++){
            if(result[i] != 1){
                return i;
            }
        }*/
        
        //bit manipulation
        
        int miss = nums.length;
        
        for(int i = 0; i < nums.length; i++){
            miss ^= nums[i] ^ i;
        }
        
        return miss;
    }
}
