class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int []pair : adjacentPairs) {
            if(!map.containsKey(pair[0])) {
                map.put(pair[0],new ArrayList<>());
            }
            map.get(pair[0]).add(pair[1]);
            if(!map.containsKey(pair[1])) {
                map.put(pair[1],new ArrayList<>());
            }
            map.get(pair[1]).add(pair[0]);
        }
        int start = 0;
        for(int u : map.keySet()) {
            if(map.get(u).size() == 1) {
                start = u;
                break;
            }
        }
        int []res = new int[map.size()];
        int prev = Integer.MIN_VALUE;
        int curr = start;
        for(int i=0;i<res.length;i++) {
            res[i] = curr;
            for(int next : map.get(curr)) {
                if(prev != next) {
                    prev = curr;
                    curr = next;
                    break;
                }
            }
        }
        return res;
    }
}