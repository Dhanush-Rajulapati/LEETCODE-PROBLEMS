class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>9*num) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        for(int i=0;i<num;i++) {
                int d = Math.min(9,sum);
                res.append(d);
                sum-=d;
            }
        if(sum!=0) {
            return "";
        }
        return res.toString();
    }
}