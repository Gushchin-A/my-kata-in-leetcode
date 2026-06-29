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
    public int findTilt(TreeNode root) {
        int[] sumTilt = new int[1];

        dfs(root, sumTilt);

        return sumTilt[0];
    }

    private int dfs(TreeNode root, int[] sumTilt) {
        if (root == null) {
            return 0;
        }

        int left = dfs(root.left, sumTilt);
        int right = dfs(root.right, sumTilt);

        sumTilt[0] += Math.abs(left - right);

        return root.val + left + right;
    }
}
