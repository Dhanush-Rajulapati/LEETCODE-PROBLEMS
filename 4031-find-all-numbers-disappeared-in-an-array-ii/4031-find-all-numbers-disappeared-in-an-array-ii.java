class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i=lower;i<=upper;i++) {
            if(!set.contains(i)) {
                int start = i;
                while(i <= upper && !set.contains(i)) {
                    i++;
                }
                List<Integer> temp = new ArrayList<>();
                temp.add(start);
                temp.add(i-1);
                res.add(new ArrayList<>(temp));
            }
        }
        return res;
    }
}