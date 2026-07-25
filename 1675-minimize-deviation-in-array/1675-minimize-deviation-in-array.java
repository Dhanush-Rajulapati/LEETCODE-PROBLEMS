class Solution {
    public int minimumDeviation(int[] nums) {
        int min = Integer.MAX_VALUE;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums) {
            if((num & 1) == 1) {
                num *= 2;
            }
            q.add(num);
            if(min > num) {
                min = num;
            }
        }

        int res = Integer.MAX_VALUE;
        while(true) {
            int max = q.remove();
            res = Math.min(res,Math.abs(max-min));

            if((max & 1) == 1) {
                break;
            }

            max = max/2;
            q.add(max);
            if(min > max) {
                min = max;
            }
        }
        return res;
    }
}