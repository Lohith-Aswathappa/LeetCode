class Solution {
    public int longestPalindrome(String s) {
        //edge case
        if(s == null || s.length() == 0)
            return 0;
        //logic
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            
            if(set.contains(temp)){
                count += 2;
                set.remove(temp);
            }else{
                set.add(temp);
            }
        }
        
        if(!set.isEmpty()){
            count++;
        }
        
        
        return count;
    }
}
