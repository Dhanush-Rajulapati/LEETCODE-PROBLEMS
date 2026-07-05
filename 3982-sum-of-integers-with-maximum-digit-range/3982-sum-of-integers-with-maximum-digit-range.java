class Solution {
    public int maxDigitRange(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int []d = new int[n];
        for(int i=0;i<n;i++) {
            d[i] = compute(nums[i]);
            max = Math.max(max,d[i]);
        }
        int sum = 0;
        for(int i=0;i<n;i++) {
            if(d[i] == max) {
                sum += nums[i];
            }
        }
        return sum;
    }
    public int compute(int num) {
        int min = 10;
        int max = -1;
        while(num != 0) {
            int r = num%10;
            min = Math.min(min,r);
            max = Math.max(max,r);
            num /= 10;
        }
        return max-min;
    }
}