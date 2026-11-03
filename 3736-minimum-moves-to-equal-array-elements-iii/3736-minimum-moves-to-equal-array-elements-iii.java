class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : nums) {
            sum += num;
            max = Math.max(num,max);
        }
        return n*max-sum;
    }
}