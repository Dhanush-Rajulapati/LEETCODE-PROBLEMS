class Solution {
    public int sumOfBeauties(int[] nums) {
        int n = nums.length;
        int []suf = new int[n];

        suf[n-1] = nums[n-1];

        for(int i=1;i<n;i++) {
            suf[n-i-1] = Math.min(suf[n-i],nums[n-i]);
        }

        int res = 0;
        int pre = nums[0];
        for(int i=1;i<=n-2;i++) {
            if(nums[i] > pre && nums[i] < suf[i]) {
                res += 2;
            }
            else if(nums[i] > nums[i-1] && nums[i] < nums[i+1]) {
                res++;
            }
            pre = Math.max(pre,nums[i]);
        }
        return res;
    }
}