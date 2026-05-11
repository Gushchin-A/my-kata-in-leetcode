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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        helperCheckPaths(root, str, result);

        return result;
    }

    private void helperCheckPaths(TreeNode node, StringBuilder str, List<String> result) {
        if (node == null) {
            return;
        }

        int lengthBefore = str.length();

        if (str.length() > 0) {
            str.append("->");
        }

        str.append(node.val);

        if (node.left == null && node.right == null) {
            result.add(str.toString());
        }

        helperCheckPaths(node.left, str, result);
        helperCheckPaths(node.right, str, result);

        str.setLength(lengthBefore);
    }
}