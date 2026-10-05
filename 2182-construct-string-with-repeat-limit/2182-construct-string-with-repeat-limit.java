class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int []freq = new int[26];
        for(char ch : s.toCharArray()) {
            freq[ch-'a']++;
        }
        StringBuilder res = new StringBuilder();
        int i = 25;
        while(i >= 0) {
            if(freq[i] == 0) {
                i--;
                continue;
            }
            int limit = Math.min(repeatLimit,freq[i]);
            freq[i] -= limit;
            for(int j=0;j<limit;j++) {
                res.append((char)('a'+i));
            }
            if(freq[i] > 0) {
                int j = i-1;
                while(j >= 0 && freq[j] == 0) {
                    j--;
                }
                if(j < 0) {
                    break;
                }
                freq[j]--;
                res.append((char)('a'+j));
            }
            else {
                i--;
            }
        }
        return res.toString();
    }
}