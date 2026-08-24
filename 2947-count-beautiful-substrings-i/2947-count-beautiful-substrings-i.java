class Solution {
    public int beautifulSubstrings(String s, int k) {
        int res = 0;
        int n = s.length();
        for(int i=0;i<n;i++) {
            int v = 0;
            int c = 0;
            for(int j=i;j<n;j++) {
                char ch = s.charAt(j);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    v++;
                }
                else {
                    c++;
                }
                if(v == c && (v*v)%k == 0) {
                    res++;
                }
            }
        }
        return res;
    }
}