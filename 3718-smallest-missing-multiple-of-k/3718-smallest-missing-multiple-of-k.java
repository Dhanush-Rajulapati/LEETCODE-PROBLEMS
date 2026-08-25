class Solution {
    public int missingMultiple(int[] nums, int k) {
        int mul = k;
        while(true) {
            boolean flag = false;
            for(int num : nums) {
                if(num == mul) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                return mul;
            }
            mul += k;
        }
    }
}