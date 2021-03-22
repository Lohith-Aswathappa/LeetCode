class Solution {
    public String convert(String s, int numRows) {
        // edge case
        if(numRows == 1){
            return s;
        }
        
        //logic
        List<StringBuilder> result = new ArrayList<>();
        
        for(int i = 0; i < numRows; i++){
            if(result.size() == i){
                result.add(new StringBuilder());
            }
        }
        int j = 0;
        
        for(int i = 0; i < s.length(); i++){
            while(j < numRows && i < s.length()){
                result.get(j++).append(s.charAt(i++));
            }
            j = j - 2;
            while(j >= 0 && i < s.length()){
                result.get(j--).append(s.charAt(i++));
            }
            j = j + 2;
            i--;
        }
        
        StringBuilder res = new StringBuilder();
        
        for(int i = 0; i < numRows; i++){
            res.append(result.get(i));
        }
        
        return res.toString();
    }
}