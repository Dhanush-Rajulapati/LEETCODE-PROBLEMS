class Solution {
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums) {
            int rev = reverse(num);
            int sum = num-rev;
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        long res = 0;
        for(int val : map.values()) {
            long add = 1L*val*(val-1)/2;
            res = (res+add)%1000000007;
        }
        return (int)res;
    }
    public int reverse(int n) {
        int res = 0;
        while(n != 0) {
            res = res*10+n%10;
            n /= 10;
        }
        return res;
    }
    
}