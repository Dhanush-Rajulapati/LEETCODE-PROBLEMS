class Solution {
    public String largestGoodInteger(String num) {
        char res = 0;

        for (int i = 0; i < num.length() - 2; i++) {
            char c = num.charAt(i);
            if (c == num.charAt(i + 1) && c == num.charAt(i + 2)) {
                res = (char) Math.max(res, c);
            }
        }

        return res == 0 ? "" : "" + res + res + res;
    }
}