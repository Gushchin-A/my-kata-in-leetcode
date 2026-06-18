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
    private TreeNode prev;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode();
        prev = dummy;

        inorder(root);

        return dummy.right;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);

        prev.right = root;
        root.left = null;
        prev = root;

        inorder(root.right);
    }
}
