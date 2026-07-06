class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length < 3) {
            return 0;
        }
        int res = 0;
        int start = 0;
        int idx = 1;
        while(idx < arr.length) {
            if(arr[idx] <= arr[idx-1]) {
                start = idx;
                idx++;
                continue;
            }
            while(idx < arr.length && arr[idx] > arr[idx-1]) {
                idx++;
            }
            if(idx == arr.length || arr[idx] == arr[idx-1]) {
                continue;
            }
            while(idx < arr.length && arr[idx] < arr[idx-1]) {
                idx++;
            }
            res = Math.max(res,idx-start);
            start = idx-1;
        }
        return res;
    }
}