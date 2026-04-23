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
    public List<Integer> preorderTraversal(TreeNode r) {
        List<Integer> res = new ArrayList<>();
        dfs(r, res);
        return res;
    }
    void dfs(TreeNode n, List<Integer> res) {
        if (n == null) return;
        res.add(n.val);
        dfs(n.left, res);
        dfs(n.right, res);
    }
}