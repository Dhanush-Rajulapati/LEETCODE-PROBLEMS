class Solution {
    public int findBestValue(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = 0;
        for(int num : arr) {
            high = Math.max(high,num);
        }
        int res = high;
        int minDiff = Integer.MAX_VALUE;
        while(low <= high) {
            int mid = low+(high-low)/2;
            int sum = getSum(arr,mid);
            int currDiff = Math.abs(sum-target);
            if(currDiff < minDiff || (currDiff == minDiff && mid < res)) {
                res = mid;
                minDiff = currDiff;
            }
            else if(sum < target) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return res;
    }
    public int getSum(int []arr,int mid) {
        int sum = 0;
        for(int num : arr) {
            if(num > mid) {
                sum += mid;
            }
            else {
                sum += num;
            }
        }
        return sum;
    }
}