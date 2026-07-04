class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer> primes = generatePrimes(left,right);
        int []res = {-1,-1};
        if(primes.size() < 2) {
            return res;
        }
        int min = primes.get(1)-primes.get(0);
        res[0] = primes.get(0);
        res[1] = primes.get(1);
        for(int i=1;i<primes.size();i++) {
            int diff =primes.get(i)-primes.get(i-1);
            if(diff < min) {
                min = diff;
                res[0] = primes.get(i-1);
                res[1] = primes.get(i);
            }
        }
        return res;
    }
    public List<Integer> generatePrimes(int left,int right) {
        boolean []primes = new boolean[right+1];
        Arrays.fill(primes,true);
        primes[0] = primes[1] = false;
        List<Integer> res = new ArrayList<>();
        for(int i=2;i*i<=right;i++) {
            if(primes[i]) {
                for(int j=i*i;j<=right;j+=i) {
                    primes[j] = false;
                }
            }
        }
        for(int i=left;i<=right;i++) {
            if(primes[i]) {
                res.add(i);
            }
        }
        return res;
    }
}