class Solution {
    public int findPairs(int[] nums, int k) {
        //edge case
        
        //logic
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        int count = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            
            if(k > 0 && map.containsKey(key+k))
                count++;
            else if (k == 0 && val > 1)
                count++;
        }
        return count;
    }
}