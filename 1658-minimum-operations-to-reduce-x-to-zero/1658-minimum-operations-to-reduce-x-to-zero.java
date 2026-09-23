class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for(int num : nums) {
            totalSum += num;
        }
        if(totalSum < x) {
            return -1;
        }
        int sumWant = totalSum-x;
        int left = 0;
        int right = 0;
        int sum = 0;
        int n = nums.length;
        int len = -1;
        while(right < n) {
            sum += nums[right];
            while(sum > sumWant) {
                sum -= nums[left];
                left++;
            }
            if(sum == sumWant) {
                len = Math.max(len,right-left+1);
            }
            right++;
        }
        return len == -1 ? -1 : n-len;
    }
}