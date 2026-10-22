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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null && subRoot != null) {
            return false;
        }
        if (check(root, subRoot)) {
            return true;
        }
        boolean b1 = isSubtree(root.left, subRoot);
        boolean b2 = isSubtree(root.right, subRoot);
        return b1 || b2;
    }

    public boolean check(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) {
            return true;
        }
        if (r1 != null && r2 != null && r1.val == r2.val) {
            return check(r1.left, r2.left) && check(r1.right, r2.right);
        } else {
            return false;
        }
    }
}