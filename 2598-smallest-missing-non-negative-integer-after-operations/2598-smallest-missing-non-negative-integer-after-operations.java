class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int []freq = new int[value];
        for(int num : nums) {
            int idx = (num%value+value)%value;
            freq[idx]++;
        }
        int idx = 0;
        while(freq[idx%value] > 0) {
            freq[idx%value]--;
            idx++;
        }
        return idx;
    }
}