class Solution {
    public int removeDuplicates(int[] nums) {
        //edge case
        if(nums == null || nums.length == 0)
            return 0;
        //logic
        int run = nums[0];
        int index = 1;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[index++] = nums[i];
            }
        }
        
        return index;
    }
}
