class Solution {
    public int countPairs(int[] deliciousness) {
        int []power = new int[22];
        for(int i=0;i<=21;i++) {
            power[i] = (1<<i);
        }
        long res = 0;
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int num : deliciousness) {
            for(int p : power) {
                if(set.containsKey(p-num)) {
                   res = (res + set.get(p-num))%1000000007;
                }
            }
            set.put(num,set.getOrDefault(num,0)+1);
        }
        return (int)res;
    }
}