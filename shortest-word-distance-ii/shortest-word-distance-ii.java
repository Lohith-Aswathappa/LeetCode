class WordDistance {
    HashMap<String, List<Integer>> map;
    public WordDistance(String[] words) {
        map = new HashMap<>();
        
        for(int i = 0; i < words.length; i++){
            if(!map.containsKey(words[i])){
                map.put(words[i], new ArrayList<>());
            }
            
            map.get(words[i]).add(i);
        }
    }
    
    public int shortest(String word1, String word2) {
        
        List<Integer> l1 = map.get(word1);
        List<Integer> l2 = map.get(word2);
        
        int point1 = 0;
        int point2 = 0;
        int mini = Integer.MAX_VALUE;
        
        
        while(point1 < l1.size() && point2 < l2.size()){
            mini = Math.min(mini, Math.abs(l1.get(point1) - l2.get(point2)));
            
            if(l1.get(point1) < l2.get(point2)){
                point1++;
            }else{
                point2++;
            }
        }
        
        return mini;
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(words);
 * int param_1 = obj.shortest(word1,word2);
 */