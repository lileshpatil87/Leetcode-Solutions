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
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            for (int i = q.size(); i > 0; i--) {
                TreeNode t = q.poll();
                if (t != null) {
                    l.add(t.val);
                    q.add(t.left);
                    q.add(t.right);
                }
            }
            if (l.size() > 0) {
                res.add(l);
            }

        }
        return res;
    }

}