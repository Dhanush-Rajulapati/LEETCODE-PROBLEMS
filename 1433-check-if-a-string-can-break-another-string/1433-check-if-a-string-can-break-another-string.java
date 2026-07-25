class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        int n = s1.length();
        int []aFreq = new int[26];
        int []bFreq = new int[26];

        for(char ch : s1.toCharArray()) {
            aFreq[ch-'a']++;
        }

        for(char ch : s2.toCharArray()) {
            bFreq[ch-'a']++;
        }

        boolean a = false;
        boolean b = false;

        int count1 = 0;
        int count2 = 0;

        for(int i=0;i<26;i++) {
            count1 += aFreq[i];
            count2 += bFreq[i];

            if(count1 > count2) {
                if(b) {
                    return false;
                }
                a = true;
            }
            else if(count2 > count1) {
                if(a) {
                    return false;
                }
                b = true;
            }
        }
        return true;
    }
}