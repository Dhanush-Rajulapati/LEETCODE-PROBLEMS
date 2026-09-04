class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            map.put(nums[i],i);
        }
        int m = operations.length;
        for(int i=0;i<m;i++) {
            int idx = map.get(operations[i][0]);
            nums[idx] = operations[i][1];
            map.remove(operations[i][0]);
            map.put(operations[i][1],idx);
        }
        return nums;
    }
}