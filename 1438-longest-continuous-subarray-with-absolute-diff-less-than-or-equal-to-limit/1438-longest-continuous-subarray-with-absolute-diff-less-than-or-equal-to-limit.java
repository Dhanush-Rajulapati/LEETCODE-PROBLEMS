class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> max = new ArrayDeque<>();
        Deque<Integer> min = new ArrayDeque<>();
        int res = 0;
        int left = 0;
        int right = 0;
        while(right < nums.length) {
            while(!max.isEmpty() && max.peekLast() < nums[right]) {
                max.removeLast();
            }
            while(!min.isEmpty() && min.peekLast() > nums[right]) {
                min.removeLast();
            }
            max.addLast(nums[right]);
            min.addLast(nums[right]);
            while(Math.abs(max.peek()-min.peek()) > limit) {
                if(max.peek() == nums[left]) {
                    max.removeFirst();
                }
                if(min.peek() == nums[left]) {
                    min.removeFirst();
                }
                left++;
            }
            res = Math.max(res,right-left+1);
            right++;
        }
        return res;
    }
}