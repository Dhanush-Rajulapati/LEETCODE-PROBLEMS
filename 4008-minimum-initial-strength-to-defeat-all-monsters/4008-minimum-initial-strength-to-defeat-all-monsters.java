class Solution {
    public long minInitialStrength(int[] monsters, int[][] boosts) {
        int n = monsters.length;
        long []diff = new long[n+1];
        for(int []boost : boosts) {
            int l = boost[0];
            int r = boost[1];
            int v = boost[2];
            diff[l] += v;
            if(r < n-1) {
                diff[r+1] -= v;
            }
        }
        long []bonus = new long[n];
        bonus[0] = diff[0];
        for(int i=1;i<n;i++) {
            bonus[i] = bonus[i-1]+diff[i];
        }
        long low = 0;
        long high = 0;
        for(int monster : monsters) {
            high += monster;
        }
        while(low < high) {
            long mid = low+(high-low)/2;
            if(isValid(monsters,bonus,mid)) {
                high = mid;
            }
            else {
                low = mid+1;
            }
        }
        return low;
    }
    public boolean isValid(int []monsters,long []bonus,long num) {
        for(int i=0;i<monsters.length;i++) {
            if(num+bonus[i] < monsters[i]) {
                return false;
            }
            num -= monsters[i];
            if(num < 0) {
                num = 0;
            }
        }
        return true;
    }
}