class Solution {
    public void moveZeroes(int[] nums) {
        //edge case
        if(nums == null || nums.length == 0)
            return;
        
        //logic
        
        int index = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        
        while(index < nums.length){
            nums[index++] = 0;
        }
    }
}
