class Solution {
    int MOD = (int)1e09+7;
    public int minimumCost(int[] nums, int k) {
        int r = k;
        long count = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] > r) {
                long diff = nums[i]-r;
                long t = diff/k;
                if(diff%k != 0) {
                    t++;
                }
                count += t;
                r += (t*k);
            }
            r -= nums[i];
        }
        long c1 = count;
        long c2 = count+1;
        if(c1%2 == 0) {
            c1 /= 2;
        }
        else {
            c2 /= 2;
        }
        long res = ((c1%MOD)*(c2%MOD))%MOD;
        return (int)res;
    }
}