class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //edge case
        // if(nums1 == null || nums2 == null)
        //     return result;
        //logic
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : nums1){
            set.add(i);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : nums2){
            if(set.contains(i)){
                list.add(i);
                set.remove(i);
            }
        }
        
        int[] result = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        
        return result;
    }
}
