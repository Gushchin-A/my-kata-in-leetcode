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
    public boolean checkTree(TreeNode root) {
        int[] sumChildren = new int[1];
        helper(root, sumChildren);

        return root.val == sumChildren[0];
    }

    private void helper(TreeNode node, int[] sumChildren) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            return;
        }

        sumChildren[0] += node.left.val + node.right.val;
        helper(node.left, sumChildren);
        helper(node.right, sumChildren);
    }
}