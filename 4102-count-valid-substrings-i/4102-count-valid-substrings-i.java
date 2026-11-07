class Solution {
    public long countValidSubstrings(String s) {
        long  res = 0;
        int left = 0;
        int right = 0;
        while(right < s.length()) {
            if(right-left+1 > 2) {
                boolean flag = true;
                char ch = 'a';
                for(int i=right-2;i<=right;i++) {
                    if(ch != s.charAt(i)) {
                        flag = false;
                        break;
                    }
                    ch++;
                }
                if(flag) {
                    left = right-1;
                }
            }
            res += right-left+1;
            right++;
        }
        return res;
    }
}