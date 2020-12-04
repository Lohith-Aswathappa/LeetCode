class Solution {
    public int singleNumber(int[] nums) {
        //edge case
        if(nums == null || nums.length == 0){
            return -1;
        }
        
        //logic
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        for(int key : map.keySet()){
            if(map.get(key) == 1)
                return key;
        } 
        
        
        return -1;
    }
}
