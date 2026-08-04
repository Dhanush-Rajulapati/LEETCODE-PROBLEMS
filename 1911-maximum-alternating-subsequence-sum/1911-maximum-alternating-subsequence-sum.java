class Solution {
    int n;
    long [][]dp;
    public long maxAlternatingSum(int[] nums) {
        n = nums.length;
        dp = new long[n][2];
        for(long []row : dp) {
            Arrays.fill(row,-1);
        }
        return solve(nums,n-1,true);
    }
    public long solve(int []nums,int n,boolean even) {
        if(n < 0) {
            return 0;
        }
        if(dp[n][even ? 0 : 1] != -1) {
            return dp[n][even ? 0 : 1];
        }
        long take = even ? nums[n] : -nums[n];
        take += solve(nums,n-1,!even);
        long notTake = solve(nums,n-1,even);
        return dp[n][even ? 0 : 1] = Math.max(take,notTake);
    }
}