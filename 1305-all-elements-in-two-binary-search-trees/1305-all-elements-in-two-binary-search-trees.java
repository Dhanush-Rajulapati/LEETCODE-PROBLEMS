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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res1 = new ArrayList<>();
        inorder(root1,res1);
        ArrayList<Integer> res2 = new ArrayList<>();
        inorder(root2,res2);
        ArrayList<Integer> res = new ArrayList<>();
        int i=0,j=0;
        while(i < res1.size() && j < res2.size()) {
            if(res1.get(i) < res2.get(j)) {
                res.add(res1.get(i));
                i++;
            }
            else {
                res.add(res2.get(j));
                j++;
            }
        }
        while(j < res2.size()) {
            res.add(res2.get(j));
            j++;
        }
        while(i < res1.size()) {
            res.add(res1.get(i));
            i++;
        }
        return res;
    }
    static void inorder(TreeNode root,List<Integer> res)
    {
        if(root != null)
        {
            inorder(root.left,res);
            res.add(root.val);
            inorder(root.right,res);
        }
    }
}