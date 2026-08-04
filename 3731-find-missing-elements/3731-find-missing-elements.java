class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
            start = Math.min(num,start);
            end = Math.max(num,end);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=start;i<=end;i++) {
            if(!set.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}