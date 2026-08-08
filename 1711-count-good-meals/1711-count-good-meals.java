class Solution {
    int MOD = 1000000007;
    public int countPairs(int[] deliciousness) {
        int []power = new int[22];
        for(int i=0;i<=21;i++) {
            power[i] = (1<<i);
        }
        long res = 0;
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int num : deliciousness) {
            for(int p : power) {
                res += set.getOrDefault(p-num,0);
                if(res > MOD) {
                    res = res%MOD;
                }
            }
            set.put(num,set.getOrDefault(num,0)+1);
        }
        return (int)res;
    }
}