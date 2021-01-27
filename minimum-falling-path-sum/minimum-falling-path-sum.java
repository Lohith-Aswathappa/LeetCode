class Solution {
    public int minFallingPathSum(int[][] A) {
        //edge case
        if(A == null || A.length == 0){
            return 0;
        }
        //logic
        int[][] dp = A;
        
        for(int i = 1; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                if(j == 0){
                    dp[i][j] += Math.min(dp[i-1][j], dp[i-1][j+1]);
                }else if (j == dp[0].length-1){
                    dp[i][j] += Math.min(dp[i-1][j], dp[i-1][j-1]);
                }else{
                    dp[i][j] += Math.min(Math.min(dp[i-1][j], dp[i-1][j-1]),dp[i-1][j+1]);
                }
            }
        }
        
        System.out.println(Arrays.deepToString(dp));
        
        int minVal = Integer.MAX_VALUE;
        
        for(int i = 0; i < dp[0].length; i++){
            minVal = Math.min(minVal, dp[dp.length-1][i]);
        }
        
        return minVal;
    }
}
