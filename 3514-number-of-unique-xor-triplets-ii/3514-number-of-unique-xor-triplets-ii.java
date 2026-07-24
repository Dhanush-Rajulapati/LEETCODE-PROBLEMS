class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        
        int []pair = new int[2048];
        int []triple = new int[2048];

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                int idx = (nums[i]^nums[j]);
                pair[idx] = 1;
            }
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<2048;j++) {
                if(pair[j] == 1) {
                    int idx = (j^nums[i]);
                    triple[idx] = 1;
                }
            }
        }

        int res = 0;
        for(int num : triple) {
            res += num;
        }
        
        return res;
    }
}