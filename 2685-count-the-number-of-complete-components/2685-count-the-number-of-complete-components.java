class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
            list.add(new ArrayList<>());
        }
        for(int []e : edges) {
            list.get(e[0]).add(e[1]);
            list.get(e[1]).add(e[0]);
        }
        int res = 0;
        boolean []visit = new boolean[n];
        for(int i=0;i<n;i++) {
            if(!visit[i]) {
                List<Integer> c = new ArrayList<>();
                dfs(i,visit,c,list);
                boolean flag = true;
                for(int num : c) {
                    if(list.get(num).size() != c.size()-1) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    res++;
                }
            }
        }
        return res;
    }
    public void dfs(int u,boolean []visit,List<Integer> c,List<List<Integer>> list) {
        visit[u] = true;
        c.add(u);
        for(int num : list.get(u)) {
            if(!visit[num]) {
                dfs(num,visit,c,list);
            }
        }
    }
}