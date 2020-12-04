class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //edge case
        if(numbers == null || numbers.length  == 0)
            return new int[]{-1,-1};
        
        //logic
        int low = 0;
        int high = numbers.length-1;
        
        while(low < high){
            int sum = numbers[low] + numbers[high];
            
            if(sum == target){
                return new int[]{low+1, high+1};
            }
            
            if(sum > target){
                high--;
            }else{
                low++;
            }
        }
        
        return new int[]{-1,-1};
    }
}
