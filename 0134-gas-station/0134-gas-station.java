class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int total = 0;
        int curr = 0;
        int res = 0;
        for(int i=0;i<n;i++) {
            int diff = gas[i]-cost[i];
            total += diff;
            curr += diff;
            if(curr < 0) {
                res = i+1;
                curr = 0;
            }
        }
        return total < 0 ? -1 : res;
    }
}