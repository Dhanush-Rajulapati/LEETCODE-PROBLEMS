class Solution {
    public int sumOfBeauties(int[] nums) {
        int n = nums.length;
        int []suf = new int[n];
        suf[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--) {
            suf[i] = Math.min(suf[i+1],nums[i+1]);
        }

        int left = nums[0];
        int res = 0;
        for(int i=1;i<=n-2;i++) {
            if(left < nums[i] && nums[i] <suf[i]) {
                res+=2;
            }
            else if(nums[i-1] < nums[i] && nums[i] < nums[i+1]) {
                res++;
            }
            left = Math.max(left,nums[i]);
        }
        return res;
    }
}