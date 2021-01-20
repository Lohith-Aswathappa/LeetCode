class Solution {
    public int search(int[] nums, int target) {
        //edge case
        if(nums.length == 0 || nums == null){
            return -1;
        }
        
        //logic
        int low = 0;
        int high = nums.length-1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(nums[mid] == target){
                return mid;
            }
            
            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target <= nums[mid] ){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(target <= nums[high] && target >= nums[mid]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        
        return -1;
    }
}
