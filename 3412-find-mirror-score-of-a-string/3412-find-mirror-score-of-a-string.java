class Solution {
    public long calculateScore(String s) {
        List<Integer>[] pos = new ArrayList[26];
        for (int i=0;i<26;i++) {
            pos[i] = new ArrayList<>();
        }

        long res = 0;

        for (int i=0;i<s.length();i++) {
            int cur = s.charAt(i) - 'a';
            int mirror = 25 - cur;

            if (!pos[mirror].isEmpty()) {
                int j = pos[mirror].remove(pos[mirror].size() - 1);
                res += i - j;
            } else {
                pos[cur].add(i);
            }
        }
        return res;
    }
}