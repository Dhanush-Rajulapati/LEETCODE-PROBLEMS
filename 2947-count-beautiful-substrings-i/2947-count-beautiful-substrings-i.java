class Solution {
    public int beautifulSubstrings(String s, int k) {
        String vowels = "aeiou";
        int res = 0;
        int n = s.length();
        for(int i=0;i<n;i++) {
            int v = 0;
            int c = 0;
            for(int j=i;j<n;j++) {
                if(vowels.indexOf(s.charAt(j)) != -1) {
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