class Solution {
    public int findCenter(int[][] edges) {
        Set<Integer> set = new HashSet<>();
        for(int []edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if(set.contains(u)) {
                return u;
            }
            if(set.contains(v)) {
                return v;
            }
            set.add(u);
            set.add(v);
        }
        return 0;
    }
}