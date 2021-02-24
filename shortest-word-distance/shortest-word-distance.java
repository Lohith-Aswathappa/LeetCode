class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        //edge case
        if(words.length == 0 || words == null){
            return -1;
        }
        
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
        
        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}