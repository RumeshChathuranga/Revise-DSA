package Q235;

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

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parentval = root.val;
        int pval = p.val;
        int qval = q.val;

        if (pval > parentval &&  qval > parentval) {
            return lowestCommonAncestor(root.right, p, q);
        }
        if (pval < parentval && qval < parentval) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }
}