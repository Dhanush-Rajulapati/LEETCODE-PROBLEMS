class Solution {
    boolean []primes;
    public long splitArray(int[] nums) {
        int n = nums.length;
        sieve(n);
        long primeSum = 0;
        long nonPrimeSum = 0;
        for(int i=0;i<n;i++) {
            if(primes[i]) {
                primeSum += nums[i];
            }
            else {
                nonPrimeSum += nums[i];
            }
        }
        return Math.abs(primeSum-nonPrimeSum);
    }
    public void sieve(int n) {
        primes = new boolean[n+1];
        Arrays.fill(primes,true);
        primes[0] = primes[1] = false;
        for(int i=2;(long)i*i<=n;i++) {
            if(primes[i]) {
                for(int j=i*i;j<=n;j+=i) {
                    primes[j] = false;
                }
            }
        }
    }
}