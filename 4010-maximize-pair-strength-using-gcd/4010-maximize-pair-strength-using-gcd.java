class Solution {
    public long maxPairStrength(int[] nums) {
        long res = 0;
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                long gcd = GCD(nums[i],nums[j]);
                long ans = (1L*nums[i]*nums[j])/(gcd*gcd);
                res = Math.max(res,ans);
            }
        }
        return res;
    }
    public int GCD(int a,int b) {
        if(a == 0) {
            return b;
        }
        return GCD(b%a,a);
    }
}