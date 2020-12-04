class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> result = new ArrayList<>();
        
        //edge case
        if(n == 0){
            return result;
        }
        
        //logic
        for(int i = 1; i <= n; i++){
            StringBuilder sb = new StringBuilder();
            
            if((i %3) == 0 && (i % 5)==0){
                sb.append("FizzBuzz");
            }else if((i%3) == 0){
                sb.append("Fizz");
            }else if((i%5) == 0){
                sb.append("Buzz");
            }else{
                sb.append(i + "");
            }
            
            result.add(sb.toString());
        }
        
        return result;
    }
}
