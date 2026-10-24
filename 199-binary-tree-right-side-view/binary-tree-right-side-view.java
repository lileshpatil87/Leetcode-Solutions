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
        List<Integer> ls = new ArrayList<>();
        if (root == null) {
            return ls;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode l = null;
            for (int i = q.size(); i > 0; i--) {
                TreeNode n = q.poll();
                if (n != null) {
                    l = n;
                    q.add(n.left);
                    q.add(n.right);
                }
            }
            if (l != null) {
                ls.add(l.val);
            }
        }
        return ls;
    }
}