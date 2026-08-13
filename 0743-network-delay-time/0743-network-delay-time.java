class Solution {
    ArrayList<Pair> []G;
    public int networkDelayTime(int[][] times, int n, int k) {
        G = new ArrayList[n+1];
        for(int i=1;i<=n;i++) {
            G[i] = new ArrayList<>();
        }
        for(int i=0;i<times.length;i++) {
            int u = times[i][0];
            int v = times[i][1];
            int w = times[i][2];
            G[u].add(new Pair(v,w));
        }
        return bfs(n,k);
    }
    public int bfs(int n,int src) {
        boolean []vis = new boolean[n+1];
        int []dist = new int[n+1];
        PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> Integer.compare(a.second, b.second));
        q.add(new Pair(src,0));
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;
        int res = 0;
        int count = 0;
        while(!q.isEmpty()) {
            Pair node = q.remove();
            int p = node.first;
            if(vis[p]) {
                continue;
            }
            vis[p] = true;
            count++;
            int distP = dist[p];
            res = Math.max(res,distP);
            for(Pair next : G[p]) {
                int nxt = next.first;
                if(!vis[nxt]) {
                    int weightN = next.second;
                    int newDistN = distP+weightN;
                    if(dist[nxt] > newDistN) {
                        dist[nxt] = newDistN;
                        q.add(new Pair(nxt,newDistN));
                    }
                }
            }
        }
        return count == n ?  res : -1;
    }
}
class Pair {
    int first;
    int second;
    Pair(int first,int second) {
        this.first = first;
        this.second = second;
    }
}