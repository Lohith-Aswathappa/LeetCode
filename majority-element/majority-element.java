class Solution {
    public int majorityElement(int[] nums) {
        //edge case
        
        
        //logic
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         for(int i : nums){
//             map.put(i, map.getOrDefault(i,0)+1);
//         }
        
//         for(int key : map.keySet()){
//             if(map.get(key) > nums.length/2){
//                 return key;
//             }
//         }
        
        Arrays.sort(nums);
        
        return nums[nums.length/2];
    }
}
