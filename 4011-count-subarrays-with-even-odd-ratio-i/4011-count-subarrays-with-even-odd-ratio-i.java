class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int res = 0;
        for(int i=0;i<nums.length;i++) {
            int odd = 0;
            int even = 0;
            for(int j=i;j<nums.length;j++) {
                if(nums[j]%2 == 0) {
                    even++;
                }
                else {
                    odd++;
                }
                if(odd > 0 && (long)even*b <= (long)a*odd) {
                    res++;
                }
            }
        }
        return res;
    }
}