class Solution {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        //edge case
        if(words.length == 0 || words == null){
            return -1;
        }
        
        //logic
        if(word1.equals(word2)){
            return equalWords(words, word1);
        }
        
        return diffWords(words, word1, word2);
    }
    
    private int diffWords(String[] words, String word1, String word2){

        //logic
        int firstPoint = -1;
        int secondPoint = -1;
        int minDistance = Integer.MAX_VALUE;
        
        for(int i = 0; i < words.length; i++){
            if(words[i].equals(word1)){
                firstPoint = i;
            }else if (words[i].equals(word2)){
                secondPoint = i;
            }
            
            if(firstPoint != -1 && secondPoint != -1){
                minDistance = Math.min(minDistance, Math.abs(firstPoint - secondPoint));
            }
        }
        
        return minDistance;
    }
    
    private int equalWords(String[] words, String word1){
        
        int minDistance = Integer.MAX_VALUE;
        
        //logic
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(words[i].equals(word1)){
                result.add(i);
            }
        }
        
        for(int i = 0; i < result.size()-1; i++){
            minDistance = Math.min(minDistance, result.get(i+1) - result.get(i));
        }
        return minDistance;
    }
}