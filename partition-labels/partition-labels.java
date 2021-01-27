class Solution {
    public List<Integer> partitionLabels(String S) {
        //edge case
        if(S == null || S.length() == 0)
            return new ArrayList<>();
        //logic
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < S.length(); i++){
            map.put(S.charAt(i), i);
        }
        
        int start = 0;
        int end = 0;
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < S.length(); i++){
            end = Math.max(end, map.get(S.charAt(i)));
            
            if(i == end){
                result.add(i - start + 1);
                start = i + 1;
            }
        }
        
        return result;
    }
}
