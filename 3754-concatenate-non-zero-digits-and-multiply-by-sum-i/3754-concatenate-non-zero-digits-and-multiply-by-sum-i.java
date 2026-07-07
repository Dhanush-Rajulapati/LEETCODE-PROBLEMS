class Solution {
    public long sumAndMultiply(int n) {
        int x = 0;
        while(n > 0)
        {
            if(n % 10 != 0)
                x = x * 10 + n % 10;
            n /= 10;
        }
        int sum = 0;
        while(x>0)
        {
            sum += x%10;
            n = n*10+x%10;
            x /= 10;
        }
        return (long)sum*n;
    }
}