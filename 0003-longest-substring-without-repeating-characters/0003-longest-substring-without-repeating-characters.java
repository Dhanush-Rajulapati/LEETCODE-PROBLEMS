class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();
        while(right < s.length()) {
            char ch = s.charAt(right);
            while(set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            res = Math.max(res,right-left+1);
            right++;
        }
        return res;
    }
}