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
    public int maxLevelSum(TreeNode root) {
        Map<Integer,Integer> map = new HashMap<>();
        helper(root,map,1);
        int max = 1;
        for(int key : map.keySet()) {
            if(map.get(key) > map.get(max)) {
                max = key;
            }
        }
        return max;
    }
    public void helper(TreeNode root,Map<Integer,Integer> map,int level) {
        if(root == null) {
            return;
        }
        map.put(level,map.getOrDefault(level,0)+root.val);
        helper(root.left,map,level+1);
        helper(root.right,map,level+1);
    }
}