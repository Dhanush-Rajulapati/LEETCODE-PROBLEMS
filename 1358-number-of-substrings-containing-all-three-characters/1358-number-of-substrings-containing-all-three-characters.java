class Solution {
    public int numberOfSubstrings(String s) {
        int res = 0;
        int aIdx = -1;
        int bIdx = -1;
        int cIdx = -1;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch =='a')
                aIdx = i;
            if(ch =='b')
                bIdx = i;
            if(ch =='c')
                cIdx = i;
            int idx = Math.min(aIdx,Math.min(bIdx,cIdx));
            if(idx > -1)
                res += (idx+1);
        }
        return res;
    }
}