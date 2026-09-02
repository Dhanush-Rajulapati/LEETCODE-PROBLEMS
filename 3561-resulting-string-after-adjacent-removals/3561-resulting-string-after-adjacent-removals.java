class Solution {
    public String resultingString(String s) {
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()) {
            int len = ans.length();
            if(len != 0) {
                char curr = ans.charAt(len-1);
                char prev = (char)('a'+(curr-'a'+1)%26);
                char next = (char)('a'+(curr-'a'+25)%26);
                if(ch == prev || ch == next) {
                    ans.deleteCharAt(len-1);
                    continue;
                }
            }
            ans.append(ch);
        }
        return ans.toString();
    }
}