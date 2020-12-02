class Solution {
    public void sortColors(int[] nums) {
        //edge case
        
        //logic
        int p0 = 0;
        int curr = 0;
        int p2 = nums.length - 1;
        int temp = 0;
        while(curr <= p2){
            //case 1
            if(nums[curr] == 0){
                temp = nums[p0];
                nums[p0++] = nums[curr];
                nums[curr++] = temp;
            }
            //case 2
            else if(nums[curr] == 2){
                temp = nums[curr];
                nums[curr] = nums[p2];
                nums[p2--] = temp;
            }
            //case 3
            else {
                curr++;
            }
        }
    }
}
