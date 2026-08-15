class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        boolean nonZero = false;
        int xor = 0;
        for(int num : nums) {
            xor ^= num;
            if(num != 0) {
                nonZero = true;
            }
        }
        return nonZero ? (xor == 0 ? n-1 : n) : 0;
    }
}