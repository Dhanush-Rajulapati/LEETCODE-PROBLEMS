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
    int res = 0;
    public int countDominantNodes(TreeNode root) {
        res = 0;
        helper(root);
        return res;
    }
    public int helper(TreeNode root) {
        if(root == null) {
            return Integer.MIN_VALUE;
        }
        int leftMax = helper(root.left);
        int rightMax = helper(root.right);

        int max = Math.max(root.val,Math.max(leftMax,rightMax));

        if(max == root.val) {
            res++;
        }

        return max;
    }
}