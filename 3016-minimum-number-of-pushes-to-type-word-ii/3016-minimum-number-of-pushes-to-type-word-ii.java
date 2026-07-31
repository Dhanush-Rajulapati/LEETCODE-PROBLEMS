class Solution {
    public int minimumPushes(String word) {
        int []freq = new int[26];
        for(char ch : word.toCharArray()) {
            freq[ch-'a']++;
        }
        Arrays.sort(freq);
        int res = 0;
        int mul = 1;
        int count = 0;
        for(int i=25;i>=0;i--) {
            res += (mul*freq[i]);
            count++;
            if(count == 8) {
                count = 0;
                mul++;
            }
            if(freq[i] == 0) {
                break;
            }
        }
        return res;
    }
}