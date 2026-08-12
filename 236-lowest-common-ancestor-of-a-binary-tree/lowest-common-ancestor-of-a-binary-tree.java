/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       return func(root,p,q);
    }
    public TreeNode func(TreeNode root, TreeNode p, TreeNode q){
        if(root == p || root == q || root == null){
            return root;
        }
        TreeNode l = func(root.left, p,q);
        TreeNode r = func(root.right, p,q);

        if(r!= null && l!=null) return root;
        else if(r!=null) return r;
        else if (l!=null) return l;
        else return null;
    }
}