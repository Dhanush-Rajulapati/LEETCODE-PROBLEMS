class Solution {
    public String removeOuterParentheses(String s) {
        int open = 0;
        StringBuilder res = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                if(open > 0) {
                    res.append(ch);
                }
                open++;
            }
            else {
                open--;
                if(open > 0) {
                    res.append(ch);
                }
            }
        }
        return res.toString();
    }
}