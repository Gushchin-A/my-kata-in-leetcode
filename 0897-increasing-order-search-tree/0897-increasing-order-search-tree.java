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
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> list = new LinkedList<>();

        inorder(root, list);

        return list.getFirst();
    }

    private void inorder(TreeNode root, List<TreeNode> list) {
        if (root == null) {
            return;
        }

        inorder(root.left, list);
        
        if (list.isEmpty()) {
            root.left = null;
            list.add(root);
        } else {
            TreeNode prev = list.getLast();
            prev.right = root;
            root.left = null;
            list.add(root);
        }

        inorder(root.right, list);
    }
}
