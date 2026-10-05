class Solution {
    public int partitionArray(int[] nums, int k) {
        int max = nums[0];
        int min = nums[0];
        for(int num : nums) {
            max = Math.max(num,max);
            min = Math.min(num,min);
        }
        int []freq = new int[max+1];
        for(int num : nums) {
            freq[num]++;
        }
        int res = 0;
        int i = min;
        while(i <= max) {
            res++;
            i += k;
            i++;
            while(i <= max && freq[i] == 0) {
                i++;
            }
        }
        return res;
    }
}