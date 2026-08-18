class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int []freq = new int[51];
        int max = 0;
        for(int num : nums) {
            freq[num]++;
            if(num > max) {
                max = num;
            }
        }
        if(k == n) {
            return max;
        }
        if(k == 1) {
            for(int i=50;i>=0;i--) {
                if(freq[i] == 1) {
                    return i;
                }
            }
            return -1;
        }
        max = Math.max(nums[0],nums[n-1]);
        int min = Math.min(nums[0],nums[n-1]);
        if(freq[max] == 1) {
            return max;
        }
        if(freq[min] == 1) {
            return min;
        }
        return -1;
    }
}