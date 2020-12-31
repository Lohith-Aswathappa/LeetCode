class Solution {
    public int[] twoSum(int[] nums, int target) {
        //edge case
        if(nums == null || nums.length == 0){
            return new int[]{-1,-1};
        }
        /*brute logic
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }*/
        
        //optimized approach
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int comp = target - nums[i];
            
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }
            
            map.put(nums[i], i);
        }
        
        
        return new int[]{-1,-1};
    }
}
