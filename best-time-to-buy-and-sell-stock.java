class Solution {
    public int maxProfit(int[] prices) {
        //edge case 
        if(prices == null || prices.length == 0)
            return 0;
        //logic
        int minimum = Integer.MAX_VALUE;
        int profit = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(minimum > prices[i])
                minimum = prices[i];
            
            if(prices[i] - minimum > profit)
                profit = prices[i] - minimum;
            
            // minimum = Math.min(minimum, prices[i]);
            // profit = Math.max(profit, prices[i] - minimum);
        }
        
        return profit;
    }
}
