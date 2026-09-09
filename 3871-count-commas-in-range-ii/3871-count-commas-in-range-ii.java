class Solution {
    public long countCommas(long n) {
        // if(n < 1000)
        //     return 0;
        // if(n < 1000000)
        //     return n-999;
        // if(n < 1000000000)
        //     return 999000+(n-999999)*2;
        // if(n < 1000000000000L)
        //     return 1998999000L+(n-999999999L)*3;
        // return 2998998999000L+(n-999999999999L)*4;
        long ans = 0;
        long base = 1000;
        long c = 1;
        while(base <= n)
            {
                long next = base*1000-1;
                if(next > n)
                    next=n;
                ans += (next-base+1)*c;
                base = base*1000;
                c++;
            }
        return ans;
    }
}