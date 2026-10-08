class Solution {
    public int numSpecialEquivGroups(String[] words) {
        Set<String> set = new HashSet<>();
        for(String s : words) {
            char []evenString = new char[(s.length()+1)/2];
            char []oddString = new char[s.length()/2];

            for(int i=0;i<s.length();i++) {
                if(i%2 == 0) {
                    evenString[i/2] = s.charAt(i);
                }
                else {
                    oddString[i/2] = s.charAt(i);
                }
            }

            Arrays.sort(evenString);
            Arrays.sort(oddString);

            String str = new String(evenString)+new String(oddString);
            set.add(str);
        }
        return set.size();
    }
}