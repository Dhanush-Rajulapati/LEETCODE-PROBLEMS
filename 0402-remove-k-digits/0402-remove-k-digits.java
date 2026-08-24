class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();
        for(char ch : num.toCharArray()) {
            int len = sb.length();
            while(k > 0 && len > 0 && sb.charAt(len-1) > ch) {
                k--;
                sb.deleteCharAt(len-1);
                len--;
            }
            sb.append(ch);
        }
        while(k > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }
        while(sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}