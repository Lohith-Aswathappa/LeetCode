class Solution {
    public int[] searchRange(int[] nums, int target) {
        //edge case
        if(nums == null || nums.length == 0)
            return new int[]{-1,-1};
        //logic
        
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        
        return new int[]{first, last};
    }
    
    private int findFirst(int[] nums, int target){
        int low = 0;
        int high = nums.length -1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(nums[mid] == target){
                if((mid == low || nums[mid-1] < target)){
                    return mid;
                }else{
                    high = mid-1;
                }
            }
            else if(nums[mid] < target) {
                low = mid+1;
            }else{
                high = mid-1;
            }  
        }
        return -1;
