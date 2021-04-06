class Solution {
    public boolean isAnagram(String s, String t) {
        //base case
        if(s.length() != t.length())
            return false;
        //logic
        int[] arr = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                return false;
            }
        }
        
        return true;
    }
}