class Solution {
    public int findShortestSubArray(int[] nums) {
        //edge case
        if(nums == null || nums.length == 0){
            return -1;
        }
        //logic
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(!left.containsKey(nums[i])){
                left.put(nums[i],i);
            }
            right.put(nums[i],i);
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        
        int maxDegree = Collections.max(map.values());
        int minVal = Integer.MAX_VALUE;
        
        for(int i : map.keySet()){
            if(map.get(i) == maxDegree){
                minVal = Math.min(minVal, right.get(i) - left.get(i) + 1);
            }
        }
        
        
        return minVal;
    }
}
