class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            
            if(temp == '('){
                st.push(')');
            }else if (temp == '['){
                st.push(']');
            }else if(temp == '{'){
                st.push('}');
            }else{
                if(st.isEmpty() || st.peek() != temp){
                    return false;
                }
                st.pop();
            }
        }
        
        return st.isEmpty();
    }
}