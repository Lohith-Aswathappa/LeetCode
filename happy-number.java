class Solution {
    HashSet<Integer> set;
    public boolean isHappy(int n) {
        //edge case
        if(n == 1)
            return true;
        //logic
        set = new HashSet<>();
        return compute(n);
    }
    
    private boolean compute(int n){
        //base case
        if(set.contains(n)){
            return false;
        }
        //logic
        set.add(n);
        int sum = 0;
        while(n >= 10){
            int rem = n % 10;
            sum += rem * rem;
            n = n / 10;
        }
        
        sum += n * n;
        if(sum == 1){
            return true;
        }
        
        return compute(sum);
    }
}
