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
            if(n < 3) {
                continue;
            }
            List<Integer> temp = map.get(num);
            int diff = temp.get(1) - temp.get(0);
            boolean flag = true;
            for(int i=2;i<n;i++) {
                if (temp.get(i)-temp.get(i-1) != diff) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                res++;
            }
        }
        return res;
    }
}