class Solution {
    public int minimumOperations(int[] nums, int start, int goal) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        int res = 0;
        Set<Integer> set = new HashSet<>();
        while(!q.isEmpty()) {
            int n = q.size();
            while(n-- > 0) {
                int ele = q.remove();
                if(ele == goal) {
                    return res;
                }
                if(ele < 0 || ele > 1000 || set.contains(ele)) {
                    continue;
                }
                set.add(ele);
                for(int num : nums) {
                    q.add(ele+num);
                    q.add(ele-num);
                    q.add(ele^num);
                }
            }
            res++;
        }
        return -1;
    }
}