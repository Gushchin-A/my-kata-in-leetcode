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
        List<Boolean> list = new ArrayList<>();

        dfs(root, list);

        return !list.contains(false);
    }

    private int dfs(TreeNode root, List<Boolean> list) {
        if (root == null) {
            return 0;
        }

        int left = dfs(root.left, list);
        int right = dfs(root.right, list);

        if (Math.abs(left - right) > 1) {
            list.add(false);
        } else {
            list.add(true);
        }

        return 1 + Math.max(left, right);
    }
}
