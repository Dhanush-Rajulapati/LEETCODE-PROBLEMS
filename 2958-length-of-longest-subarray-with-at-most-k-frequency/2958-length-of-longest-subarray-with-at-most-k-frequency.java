class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int res = 0;
        int left = 0;
        int right = 0;
        while(right < nums.length) {
            int num = nums[right];
            freq.put(num,freq.getOrDefault(num,0)+1);
            while(left <= right && freq.get(num) > k) {
                freq.put(nums[left],freq.get(nums[left])-1);
                left++;
            } 
            res = Math.max(res,right-left+1);
            right++;
        }
        return res;
    }
}