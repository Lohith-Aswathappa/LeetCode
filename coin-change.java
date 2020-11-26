class Solution {
    public int coinChange(int[] coins, int amount) {
        //edge case
        if(amount == 0 || coins == null || coins.length == 0)
            return 0;
        //logic
        int[][] dp = new int[coins.length+1][amount+1];
        
        for(int i = 0; i < dp.length; i++){
            dp[i][0] = 0;
        }
        
        for(int i = 0; i < dp[0].length; i++){
            dp[0][i] = 9999;
        }
        
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(j < coins[i-1]){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-coins[i-1]] + 1);
                }
            }
        }
        
        if (dp[coins.length+1-1][amount] >= 9999) return -1;
        return dp[dp.length-1][dp[0].length-1];
    }
}


/*      Recursive solution
class Solution {
    public int coinChange(int[] coins, int amount) {
        //edge case
        if(amount == 0 || coins.length == 0 || coins == null){
            return 0;
        }
        //logic
        int index = 0;
        int coinsUsed = 0;
        return helper(coins, amount, index, coinsUsed);
    }
    
    private int helper(int[] coins, int amount, int index, int coinsUsed){
        //base case
        if(index >= coins.length || amount < 0)
            return -1;
        
        if(amount == 0){
            return coinsUsed;
        }
        
        //logic
        //choose 
        int case1 = helper(coins, amount - coins[index], index, coinsUsed+1);
        //not choose
        int case2 = helper(coins, amount, index+1, coinsUsed);
        
        if(case1 < 0){
            return case2;
        }
        
        if(case2 < 0){
            return case1;
        }
        
        return Math.min(case1, case2);
    }
}
*/
