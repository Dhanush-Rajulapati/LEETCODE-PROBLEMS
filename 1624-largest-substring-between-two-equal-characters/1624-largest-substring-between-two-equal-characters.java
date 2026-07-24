class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int res = -1;
        int []first = new int[26];
        Arrays.fill(first,-1);
        for(int i=0;i<s.length();i++) {
            int idx = s.charAt(i)-'a';
            if(first[idx] == -1) {
                first[idx] = i;
            }
            else {
                res = Math.max(res,i-first[idx]-1);
            }
        }
        return res;
    }
}