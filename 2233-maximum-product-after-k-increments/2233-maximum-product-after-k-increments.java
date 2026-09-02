class Solution {
    public int maximumProduct(int[] nums, int k) {
        if(nums.length == 1) {
            return nums[0]+k;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums) {
            pq.add(num);
        }
        while(k != 0) {
            int num1 = pq.remove();
            int num2 = pq.peek();
            int diff = num2-num1;
            if(diff == 0) {
                diff = 1;
            }
            int step = Math.min(k,diff);
            k -= step;
            pq.add(num1+step);
        }
        long res = 1;
        while(!pq.isEmpty()) {
            res = (res*pq.remove())%1000000007;
        }
        return (int)res;
    }
}