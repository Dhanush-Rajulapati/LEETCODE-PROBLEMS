class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        for(int num : nums) {
            if(max < num) {
                max = num;
            }
        }
        int res = 0;
        int count = 0;
        for(int num : nums) {
            if(num == max) {
                count++;
            }
            else {
                res = Math.max(res,count);
                count = 0;
            }
        }
        return Math.max(res,count);
    }
}