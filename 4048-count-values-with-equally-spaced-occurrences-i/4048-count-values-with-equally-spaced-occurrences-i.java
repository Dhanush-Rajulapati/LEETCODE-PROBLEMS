class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        int res = 0;
        for(int num : map.keySet()) {
            int n = map.get(num).size();
            if(n == 3) {
                int first = map.get(num).get(0);
                int second = map.get(num).get(1);
                int third = map.get(num).get(2);
                if(third-second == second-first) {
                    res++;
                }
            }
        }
        return res;
    }
}