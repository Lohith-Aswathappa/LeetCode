class Solution {
    public int majorityElement(int[] nums) {
        //edge case
        
        //logic
        Arrays.sort(nums);
        
        
        return nums[nums.length/2];
    }
}
