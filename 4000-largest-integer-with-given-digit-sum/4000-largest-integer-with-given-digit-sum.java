class Solution {
    public int largestInteger(int n, int s) {
        if(s == 0) {
            return 0;
        }
        if(s > n*9) {
            return -1;
        }
        int res = 0;
        while(s != 0) {
            res = res*10+9;
            s -= 9;
            n--;
        }
        while(n-- > 0) {
            res *= 10;
        }
        return res;
    }
}