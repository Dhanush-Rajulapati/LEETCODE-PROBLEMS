class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long []res = new long[n];
        int max = nums[0];
        for(int i=0;i<n;i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
            res[i] = nums[i]+max;
        }
        for(int i=1;i<n;i++) {
            res[i] += res[i-1];
        }
        return res;
    }
}