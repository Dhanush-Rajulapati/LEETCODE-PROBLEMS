class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int num : nums)
        {
            if(num > max)
                max = num;
            if(num < min)
                min = num;
        }
        return GCD(max,min);
    }
    static int GCD(int a,int b)
    {
        if(a == 0)
            return b;
        return GCD(b%a,a);
    }
}