class Solution {
    public boolean isIsomorphic(String s, String t) {
        //edge case
        if(s.length() != t.length()){
            return false;
        }
        //logic
        HashMap<Character, Character> Smap = new HashMap<>();
        HashMap<Character, Character> Tmap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char char_s = s.charAt(i);
            char char_t = t.charAt(i);
            
            if(Smap.containsKey(char_s)){
                if(Smap.get(char_s) != char_t){
                    return false;
                }
            }else{
                Smap.put(char_s, char_t);
            }
            
            if(Tmap.containsKey(char_t)){
                if(Tmap.get(char_t) != char_s){
                    return false;
                }
            }else{
                    Tmap.put(char_t, char_s);
            }
        }
        
        return true;
        
    }
}
