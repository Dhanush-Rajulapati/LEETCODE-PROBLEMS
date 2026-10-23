class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int maxProduct = Integer.MIN_VALUE;
        int n = nums.length;
        int []res = {-1,-1};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            int num = nums[i];
            int req = target-nums[i];
            if(num == req) {
                continue;
            }
            if(map.containsKey(req)) {
                int product = req*num;
                if(product > maxProduct) {
                    maxProduct = product;
                    if(num < req) {
                        res[0] = map.get(req);
                        res[1] = i;
                    }
                    else {
                        res[1] = map.get(req);
                        res[0] = i;
                    }
                }
            }
            map.put(num,i);
        }
        return res;
    }
}