class Solution {
    public String minWindow(String s, String t) {
        int []freq1 = new int[128];
        int []freq2 = new int[128];
        int m = 0;

        for(char ch : t.toCharArray()) {
            int idx = ch;
            if(freq1[idx] == 0) {
                m++;
            }
            freq1[idx]++;
        }

        int start = -1;
        int end = -1;
        int min = Integer.MAX_VALUE;
        int left = 0;
        for(int right=0;right<s.length();right++) {
            char ch = s.charAt(right);
            freq2[ch]++;
            if(freq1[ch] == freq2[ch]) {
                m--;
            }
            while(m == 0 && left <= right) {
                if(right-left+1 < min) {
                    min = right-left+1;
                    start = left;
                    end = right+1;
                }
                char ch1 = s.charAt(left);
                left++;
                freq2[ch1]--;
                if(freq1[ch1] > freq2[ch1]) {
                    m++;
                }
            }
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(start,end);
    }
}