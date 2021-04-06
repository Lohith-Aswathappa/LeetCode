class Solution {
    public int maxProfit(int[] prices) {
        //edge case
        
        //logic
        int profit = 0;
        int mini = Integer.MAX_VALUE;
        
        for(int i = 0; i < prices.length; i++){
            mini = Math.min(prices[i], mini);
            profit = Math.max(profit, prices[i] - mini);
        }
        
        return profit;
    }
}