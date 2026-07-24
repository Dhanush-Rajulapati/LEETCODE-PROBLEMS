class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int res = -1;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),i);
            }
            else {
                res = Math.max(res,i-map.get(s.charAt(i))-1);
            }
        }
        return res;
    }
}