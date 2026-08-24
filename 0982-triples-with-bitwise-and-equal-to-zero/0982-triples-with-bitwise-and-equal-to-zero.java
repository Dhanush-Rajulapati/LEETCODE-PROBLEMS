class Solution {
    public int countTriplets(int[] nums) {
        int  []and = new int[65536];
        int n = nums.length;
        for(int num1 : nums) {
            for(int num2 : nums) {
                and[(num1&num2)]++;
            }
        }
        int res = 0;
        for(int num : nums) {
            for(int i=0;i<65536;i++) {
                if((num & i) == 0) {
                    res += and[i];
                }
            }
        }
        return res;
    }
}