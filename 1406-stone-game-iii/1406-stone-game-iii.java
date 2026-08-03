class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int []dp = new int[n+1];
        for(int i=n-1;i>=0;i--) {
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for(int j=1;j<=3;j++) {
                if(i+j > n) {
                    break;
                }
                sum += stoneValue[i+j-1];
                max = Math.max(max,sum-dp[i+j]);
            }
            dp[i] = max;
        }
        if(dp[0] < 0) {
            return "Bob";
        }
        if(dp[0] > 0) {
            return "Alice";
        }
        return "Tie";
    }
}