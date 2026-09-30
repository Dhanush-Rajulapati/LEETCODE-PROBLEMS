class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int []res = new int[n];
        int count = 0;
        int i = 0;
        for(char ch : seq.toCharArray()) {
            if(ch == '(') {
                count++;
                res[i] = count%2;
            }
            else {
                res[i] = count%2;
                count--;
            }
            i++;
        }
        return res;
    }
}