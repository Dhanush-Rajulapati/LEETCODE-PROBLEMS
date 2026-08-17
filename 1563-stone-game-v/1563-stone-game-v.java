class Solution {
    int []pre;
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        pre = new int[n];
        int [][]dp = new int[n][n];
        pre[0] = stoneValue[0];
        for(int i=1;i<n;i++) {
            pre[i] = pre[i-1]+stoneValue[i];
        }
        for(int []d : dp) {
            Arrays.fill(d,-1);
        }
        return game(dp,0,n-1);
    }
    public int game(int [][]dp,int start,int end) {
        if(dp[start][end] != -1) {
            return dp[start][end];
        }
        int res = 0;
        for(int i=start+1;i<=end;i++) {
            int currSum = 0;
            int leftSum = pre[i-1];
            if(start >= 1) {
                leftSum -= pre[start-1];
            }
            int rightSum = pre[end]-pre[i-1];
            if(leftSum < rightSum) {
                currSum = leftSum+game(dp,start,i-1);
            }
            else if(rightSum < leftSum) {
                currSum = rightSum+game(dp,i,end);
            }
            else {
                currSum = leftSum+Math.max(game(dp,start,i-1),game(dp,i,end));
            }
            res = Math.max(res,currSum);
        }
        return dp[start][end] = res;
    }
}