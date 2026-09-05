class Solution {
    public int firstStableIndex(int[] nums, int k) {
        // int n = nums.length;
        // int []min = new int[n];
        // int []max = new int[n];
        // max[0] = nums[0];
        // min[n-1] = nums[n-1];
        // for(int i=1;i<n;i++)
        // {
        //     max[i] = Math.max(nums[i],max[i-1]);
        //     min[n-i-1] = Math.min(nums[n-i-1],min[n-i]);
        // }
        // for(int i=0;i<n;i++)
        // {
        //     int num = max[i]-min[i];
        //     if(num <= k)
        //         return i;
        // }
        // return -1;

        int n = nums.length;
        int []min = new int[n];
        min[n-1] = nums[n-1];
        for(int i=1;i<n;i++)
        {
            min[n-i-1] = Math.min(nums[n-i-1],min[n-i]);
        }
        int max = nums[0];
        for(int i=0;i<n;i++)
        {
            max= Math.max(nums[i],max);
            int num = max-min[i];
            if(num <= k)
                return i;
        }
        return -1;
    }
}