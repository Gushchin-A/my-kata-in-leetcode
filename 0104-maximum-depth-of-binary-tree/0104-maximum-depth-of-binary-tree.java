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
    private static int count = 0;
    private static int maxSize = 0;

    public int maxDepth(TreeNode root) {
        dfs(root );
        
        int result = maxSize;
        maxSize = 0;
        count = 0;

        return result;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            maxSize = Math.max(maxSize, count);
            return;
        }

        count++;
        
        dfs(root.left);
        dfs(root.right);

        count--;
        return;
    }
}
