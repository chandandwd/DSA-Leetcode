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
    public List<List<Integer>> levelOrder(TreeNode r) {
        List<List<Integer>> a = new ArrayList<>();
        f(r,0,a);
        return a;
    }

    void f(TreeNode r, int d, List<List<Integer>> a) {
        if(r==null) return;

        if(a.size()==d)
            a.add(new ArrayList<>());

        a.get(d).add(r.val);

        f(r.left,d+1,a);
        f(r.right,d+1,a);
    }
}