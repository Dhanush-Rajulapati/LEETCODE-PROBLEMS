class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int res = Integer.MIN_VALUE;
        for(int i=k;i<n;i++) {
            max = Math.max(max,nums[i-k]);
            res = Math.max(res,max+nums[i]);
        }
        return res;
    }
}