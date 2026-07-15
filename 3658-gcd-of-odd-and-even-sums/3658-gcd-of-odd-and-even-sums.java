class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evenSum = 0;
        int oddSum = 0;
        for(int i=1;i<=n;i++)
        {
            evenSum += 2*i;
            oddSum += 2*i-1;
        }
        return computeGCD(evenSum,oddSum);
    }
    static int computeGCD(int a,int b)
    {
        if(a == 0)
            return b;
        return computeGCD(b%a,a);
    }
}