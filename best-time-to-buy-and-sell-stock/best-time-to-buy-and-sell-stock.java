class Solution {
    public int maxProfit(int[] prices) {
        //edge case
        if(prices == null || prices.length == 0)
            return 0;
        //logic
        
        int profit = 0;
        int mini = Integer.MAX_VALUE;
        
        for(int i = 0; i < prices.length; i++){
            if(mini > prices[i]){
                mini = prices[i];
            }
            
            if(profit < prices[i] - mini){
                profit = prices[i] - mini;
            }
        }
        
        return profit;
    }
}
