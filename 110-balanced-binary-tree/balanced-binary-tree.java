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
    public boolean isBalanced(TreeNode root) {
        return ch(root)[0] == 1;
    }

    public int[] ch(TreeNode root) {
        if (root == null) {
            return new int[] { 1, 0 };
        }
        int[] h1 = ch(root.left);
        int[] h2 = ch(root.right);
        boolean balanced = (h1[0] == 1 && h2[0] == 1) && (Math.abs(h2[1] - h1[1]) <= 1);
        int height = 1 + Math.max(h1[1], h2[1]);
        return new int[] { balanced ? 1 : 0, height };
    }
}