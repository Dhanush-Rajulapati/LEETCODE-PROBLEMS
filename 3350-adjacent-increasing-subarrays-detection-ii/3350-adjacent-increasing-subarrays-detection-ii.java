class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int maxK = 0,prev = 0,curr = 1;
        for(int i=1;i<n;i++)
        {
            if(nums.get(i) > nums.get(i-1))
                curr++;
            else
            {
                maxK = Math.max(maxK, Math.max(curr/2,Math.min(prev,curr)));

                prev = curr;
                curr = 1;
            }
        }
        maxK = Math.max(maxK, Math.max(curr/2,Math.min(prev,curr)));
        return maxK;
    }
}