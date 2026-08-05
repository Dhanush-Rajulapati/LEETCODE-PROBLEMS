class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer> []list = new ArrayList[n];
        for(int i=0;i<n;i++) {
            list[i] = new ArrayList<>();
        }   
        for(int []i : invocations) {
            list[i[0]].add(i[1]);
        }
        boolean []vis = new boolean[n];
        Arrays.fill(vis,true);
        dfs1(list,vis,k);
        for(int []i : invocations) {
            if(vis[i[0]] && !vis[i[1]]) {
                ArrayList<Integer> res = new ArrayList<>();
                for(int j=0;j<n;j++) {
                    res.add(j);
                }
                return res;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++) {
            if(vis[i]) {
                res.add(i);
            }
        }
        return res;
    }
    public void dfs1(List<Integer> []list,boolean []vis,int k) {
        vis[k] = false;
        for(int num : list[k]) {
            if(vis[num]) {
                dfs1(list,vis,num);
            }
        }
    }
}