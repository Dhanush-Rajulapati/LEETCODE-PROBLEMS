class Solution {
    public int numSquares(int n) {
        int []dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        int i=1;
        while(i*i <= n) {
            int num = i*i;
            for(int j=num;j<=n;j++) {
                if(dp[j-num] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j],dp[j-num]+1);
                }
            }
            i++;
        }
        return dp[n];
    }
}