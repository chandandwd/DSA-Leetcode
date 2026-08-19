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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        dfs(root, 0, ans);

        return ans;
    }

    void dfs(TreeNode root, int level,List<List<Integer>> arr) {

        if (root == null)
            return;

        if(level == arr.size()) arr.add(new ArrayList<>());
        arr.get(level).add(root.val);
        dfs(root.left, level + 1, arr);
        dfs(root.right, level + 1, arr);
    }
}