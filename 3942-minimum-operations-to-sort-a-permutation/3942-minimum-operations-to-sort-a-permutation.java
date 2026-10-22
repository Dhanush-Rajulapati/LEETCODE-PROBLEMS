class Solution {
    public int minOperations(int[] nums) {
        int zeroIdx = -1;
        int n = nums.length;
        for(int i=0;i<n;i++) {
            if(nums[i] == 0) {
                zeroIdx = i;
                break;
            }
        }
        boolean sorted = true;
        for(int i=0;i<n-1;i++) {
            int idx = (zeroIdx+i)%n;
            if(nums[idx] > nums[(idx+1)%n]) {
                sorted = false;
                break;
            }
        }
        if(sorted) {
            return Math.min(zeroIdx,n-zeroIdx+2);
        }
        boolean reverse = true;
        for(int i=0;i<n-1;i++) {
            int idx = (zeroIdx-i+n)%n;
            if(nums[idx] > nums[(idx-1+n)%n]) {
                reverse = false;
                break;
            }
        }
        if(!reverse) {
            return -1;
        }
        return Math.min(zeroIdx+2,n-zeroIdx);
    }
}