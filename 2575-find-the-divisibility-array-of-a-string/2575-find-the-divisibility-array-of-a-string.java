class Solution {
    public int[] divisibilityArray(String word, int m) {
        int n = word.length();
        int []res = new int[n];
        long num = 0;
        for(int i=0;i<n;i++) {
            num = num*10+(word.charAt(i)-'0');
            if(num%m == 0) {
                res[i] = 1;
            }
            num = num%m;
        }
        return res;
    }
}