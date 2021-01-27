class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        
        int maxVal = Integer.MIN_VALUE;
        
        for(int i : nums){
            maxVal = Math.max(i, maxVal);
        }
        
        int[] dp = new int[maxVal+1];
        
        for(int i : nums){
            dp[i] += i;
        }
        
        int[][] dp_1 = new int[maxVal+1][2];
        
        for(int i = 1; i <= maxVal; i++){
            dp_1[i][0] = Math.max(dp_1[i-1][0], dp_1[i-1][1]);
            dp_1[i][1] = dp[i]+dp_1[i-1][0];
        }
        
        return Math.max(dp_1[maxVal][0], dp_1[maxVal][1]);
    }
}
