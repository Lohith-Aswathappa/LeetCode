class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //edge case
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        //logic
        HashMap<String, List<String>> map = new HashMap<>();
        
        
        for(String str : strs){
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);
            
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            
            map.get(key).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}
