class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int res=0;
        HashSet<Character> ans = new HashSet<>();
        for(int right = 0;right < n;right++)
        {
            if(!ans.contains(s.charAt(right)))
            {
                ans.add(s.charAt(right));
                res = Math.max(res,right-left+1);
            }
            else
            {
                while(ans.contains(s.charAt(right)))
                {
                    ans.remove(s.charAt(left));
                    left++;
                }
                ans.add(s.charAt(right));
            }
        }
        return res;
    }
}