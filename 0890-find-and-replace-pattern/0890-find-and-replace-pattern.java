class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for(String word : words) {
            if(isValid(word,pattern)) {
                res.add(word);
            }
        }
        return res;
    }
    public boolean isValid(String s,String p) {
        int []key = new int[26];
        int []value = new int[26];
        Arrays.fill(key,-1);
        Arrays.fill(value,-1);
        for(int i=0;i<s.length();i++) {
            int k = p.charAt(i)-'a';
            int v = s.charAt(i)-'a';
            if(key[k] == -1 && value[v] == -1) {
                key[k] = v;
                value[v] = k;
            }
            else {
                if(key[k] != v || value[v] != k) {
                    return false;
                }
            }
        }
        return true;
    }
}