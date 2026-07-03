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
    public int sumNumbers(TreeNode root) {
        if(root == null)
            return 0;
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root,ans,0);
        int sum = 0;
        for(int num : ans)
            sum += num;
        return sum;
    }
    public void helper(TreeNode root,ArrayList<Integer> ans,int sum)
    {
        if(root == null)
            return;
        if(root.right == null && root.left == null)
        {
            ans.add(sum*10+root.val);
            return;
        }
        helper(root.left,ans,sum*10+root.val);
        helper(root.right,ans,sum*10+root.val);

    }
}