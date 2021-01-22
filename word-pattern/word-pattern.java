class Solution {
    public boolean wordPattern(String pattern, String s) {
        //edge case
        
        //logic
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> wordMap = new HashMap<>();
        String[] arr = s.split(" ");
        
        if(pattern.length() != arr.length){
            return false;
        }
        
        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(arr[i])){
                    System.out.println(map.get(c) + " " + arr[i]);
                    return false;
                }
            }else{
                map.put(c, arr[i]);
            }
            
            if(wordMap.containsKey(arr[i])){
                if(!wordMap.get(arr[i]).equals(c)){
                    return false;
                }
            }else{
                wordMap.put(arr[i],c);
            }
        }
        
        return true;
    }
}
