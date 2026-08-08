class Solution {
    int MOD = 1000000007;
    public int countPairs(int[] deliciousness) {
        long res = 0;
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int num : deliciousness) {
            int p = 1;
            for(int i=0;i<=21;i++) {
                res += set.getOrDefault(p-num,0);
                if(res > MOD) {
                    res = res%MOD;
                }
                p <<= 1;
            }
            set.put(num,set.getOrDefault(num,0)+1);
        }
        return (int)res;
    }
}