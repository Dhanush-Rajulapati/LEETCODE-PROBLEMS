/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<Integer> []G;
    public int amountOfTime(TreeNode root, int start) {
        G = new ArrayList[100001];
        for(int i=1;i<=100000;i++) {
            G[i] = new ArrayList<>();
        }
        helper(root);
        return bfs(start);
    }
    public void helper(TreeNode root) {
        if(root == null) {
            return;
        }
        int u = root.val;
        if(root.left != null) {
            int v = root.left.val;
            G[u].add(v);
            G[v].add(u);
        }
        if(root.right != null) {
            int v = root.right.val;
            G[u].add(v);
            G[v].add(u);
        }
        helper(root.left);
        helper(root.right);
    }
    public int bfs(int start) {
        Queue<Integer> q = new ArrayDeque<>();
        boolean []vis = new boolean[100001];
        q.add(start);
        int count = -1;
        vis[start] = true;
        while(!q.isEmpty()) {
            int n = q.size();
            count++;
            while(n-- > 0) {
                int curr = q.remove();
                for(int next : G[curr]) {
                    if(!vis[next]) {
                        q.add(next);
                        vis[next] = true;
                    }
                }
            }
        }
        return count;
    }
}