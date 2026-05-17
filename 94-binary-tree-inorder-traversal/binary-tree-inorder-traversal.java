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
    public List<Integer> inorderTraversal(TreeNode r) {
        List<Integer> res = new ArrayList<>();
        if (r == null) return res;
        res.addAll(inorderTraversal(r.left)); // left
        res.add(r.val); 
        res.addAll(inorderTraversal(r.right));// right
        return res;
    }
}