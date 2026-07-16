class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        long []prefix = new long[n];
        int max = nums[0];
        for(int i=0;i<n;i++)
            {
                if(max < nums[i])
                    max = nums[i];
                prefix[i] = gcd(nums[i],max);
            }
        Arrays.sort(prefix);
        long sum = 0;
        int left = 0,right = n-1;
        while(left < right)
            {
                sum += gcd(prefix[left],prefix[right]);
                left++;
                right--;
            }
        return sum;
    }
    public long gcd(long a,long b)
    {
        if(b == 0)
            return a;
        return gcd(b,a%b);
    }
}