class Solution {
    public int[] sortedSquares(int[] nums) {
        //edge case
        if(nums == null || nums.length == 0)
            return nums;
        
        //logic
        
        
        /*      Brute force approach
        
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        
        Arrays.sort(nums);
        
        return nums;*/
        
        //optimized
        
        int pos = 0;
        int neg = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                pos++;
            }
        }
        neg = pos - 1;
        
        int[] result = new int[nums.length];
        int index = 0;
        
        while(neg >= 0 && pos < nums.length){
            if(nums[neg] * nums[neg] < nums[pos] * nums[pos]){
                result[index++] = nums[neg] * nums[neg];
                neg--;
            }else{
                result[index++] = nums[pos] * nums[pos];
                pos++;
            }
        }
        
        while(pos < nums.length){
            result[index++] = nums[pos] * nums[pos];
            pos++;
        }
        
        while(neg >= 0){
            result[index++] = nums[neg] * nums[neg];
            neg--;
        }
    
        return result;
    }
}
​
​
/*
​
nums = [-4,-1,0,3,10]
result = [16,1,0,9,100]
sort = [0,1,9,16,100]
​
*/
