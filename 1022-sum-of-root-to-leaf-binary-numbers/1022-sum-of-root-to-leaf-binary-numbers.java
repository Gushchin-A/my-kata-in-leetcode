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
    public int sumRootToLeaf(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int accumulationNum) {
        if (root == null) {
            return 0;
        }

        accumulationNum = accumulationNum * 2 + root.val;

        if (root.left == null && root.right == null) {
            return accumulationNum;
        }

        return dfs(root.left, accumulationNum) + dfs(root.right, accumulationNum);
    }
}