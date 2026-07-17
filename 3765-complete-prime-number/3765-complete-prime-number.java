class Solution {
    public boolean completePrime(int num) {
        if(!isPrime(num)) {
            return false;
        }
        String s = num+"";
        int n = s.length();
        for(int i=0;i<n;i++) {
            if(!isPrime(Integer.parseInt(s.substring(0,i+1)))) {
                return false;
            }
            if(!isPrime(Integer.parseInt(s.substring(n-i-1)))) {
                return false;
            }
        }
        return true;
    }
    public boolean isPrime(int num) {
        if(num <= 2 || num%2 == 0) {
            return num == 2;
        }
        for(int i=3;i*i<=num;i+=2) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }
}