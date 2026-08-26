class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        String res = "";
        int resLen = Integer.MAX_VALUE;
        int count = 0;
        int left = 0;
        int right = 0;
        while(right < n) {
            if(s.charAt(right) == '1') {
                count++;
            }
            while(count > k) {
                if(s.charAt(left) == '1') {
                    count--;
                }
                left++;
            }
            if(count == k) {
                while(s.charAt(left) == '0') {
                    left++;
                }
                String currString = s.substring(left,right+1);
                if(resLen > right-left+1) {
                    res = currString;
                    resLen = right-left+1;
                }
                else if(resLen == right-left+1) {
                    if(res.compareTo(currString) > 0) {
                        res = currString;
                    }
                }
            }
            right++;
        }
        return res;
    }
}