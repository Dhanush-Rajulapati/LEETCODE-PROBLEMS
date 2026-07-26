class Solution {
    int res = 0;
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean []visit = new boolean[n];
        for(int i=0;i<n;i++) {
            if(!visit[i]) {
                res++;
                doVisit(i,isConnected,visit,n);
            }
        }
        return res;
    }

    public void doVisit(int idx,int [][]isConnected,boolean []visit,int n) {
        visit[idx] = true;
        for(int i=0;i<n;i++) {
            if(isConnected[idx][i] == 1) {
                if(!visit[i]) {
                    doVisit(i,isConnected,visit,n);
                }
            }
        }
    }
}