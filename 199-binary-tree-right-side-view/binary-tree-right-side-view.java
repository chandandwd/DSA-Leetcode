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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        q.add(root);
        while(!q.isEmpty()){
            int sz = q.size();
        for(int i = 0; i<sz; i++){
            TreeNode N = q.poll();
            if(i == sz-1) ans.add(N.val);

            if(N.left != null) q.add(N.left);
            if(N.right != null) q.add(N.right);
        }}
        return ans;

    }
}