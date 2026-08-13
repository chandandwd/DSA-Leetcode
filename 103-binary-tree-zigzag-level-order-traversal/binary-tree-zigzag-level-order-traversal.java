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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int s = q.size();
            for(int i = 0; i<s; i++){
                TreeNode N = q.poll();
                temp.add(N.val);
                if(N.left != null) q.add(N.left);
                if(N.right != null) q.add(N.right);
            }
            if(ans.size()%2==0) ans.add(temp);
            else{
                Collections.reverse(temp);
                ans.add(temp);
            }
        }
        return ans;
    }
}