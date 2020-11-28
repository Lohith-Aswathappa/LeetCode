class Solution {
    public int[] productExceptSelf(int[] nums) {
        //edge case
        if(nums == null || nums.length == 0)
            return new int[0];
        //logic
        int[] left = new int[nums.length];
        // int[] right = new int[nums.length];
        // int[] result = new int[nums.length];
        
        
        left[0] = 1;
        for(int i = 1; i < left.length; i++){
            left[i] = left[i-1] * nums[i-1];
        }
        
        
        int right = 1;
        for(int i = left.length - 1; i >= 0; i--){
            left[i] = left[i] * right;
            right = right * nums[i];
        }
        
        // for(int i = 0; i < left.length; i++){
        //     result [i] = left[i] * right[i];
        // }
        
        return left;
    }
}
