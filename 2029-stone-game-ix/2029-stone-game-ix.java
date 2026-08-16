class Solution {
    public boolean stoneGameIX(int[] stones) {
        int []mod = new int[3];
        for(int num : stones) {
            mod[num%3]++;
        }
        if(Math.min(mod[1],mod[2]) == 0) {
            return Math.max(mod[1],mod[2]) > 2 && mod[0]%2 == 1;
        }
        return Math.abs(mod[1]-mod[2]) > 2 || mod[0]%2 == 0;
    }
}