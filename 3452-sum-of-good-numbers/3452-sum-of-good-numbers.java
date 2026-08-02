class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        for(int i=0;i<n;i++) {
            boolean flag = true;
            if(i-k >= 0 && nums[i-k] >= nums[i]) {
                flag = false;
            }
            if(i+k < n && nums[i+k] >= nums[i]) {
                flag = false;
            }
            if(flag) {
                res += nums[i];
            }
        }
        return res;
    }
}