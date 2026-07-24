class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int res = 0;
        int max = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++) {
            set.add(arr[i]);
            max = Math.max(arr[i],max);
            if(max == i && max == set.size()-1) {
                res++;
            }
        }
        return res;
    }
}