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
    public boolean isCousins(TreeNode root, int x, int y) {
        Map<String, Integer> cousinsValues = new HashMap<>();

        cousinsValues.put("parentX", root.val);
        cousinsValues.put("parentY", root.val);

        dfs(root, 0, cousinsValues, x, y);
        dfs(root, 0, cousinsValues, x, y);

        return cousinsValues.get("depthX") == cousinsValues.get("depthY") && cousinsValues.get("parentX") != cousinsValues.get("parentY");
    }

    private void dfs(TreeNode root, int depth, Map<String, Integer> cousinsValues, int x, int y) {
        if (root == null) {
            return;
        }

        depth++;
        
        if (root.left != null) {
            if (root.left.val == x) {
                cousinsValues.put("depthX", depth + 1);
                cousinsValues.put("parentX", root.val);
                return;
            }
            if (root.left.val == y) {
                cousinsValues.put("depthY", depth + 1);
                cousinsValues.put("parentY", root.val);
                return;
            }
        }

        if (root.right != null) {
            if (root.right.val == x) {
                cousinsValues.put("depthX", depth + 1);
                cousinsValues.put("parentX", root.val);
                return;
            }
            if (root.right.val == y) {
                cousinsValues.put("depthY", depth + 1);
                cousinsValues.put("parentY", root.val);
                return;
            }
        }

        dfs(root.left, depth, cousinsValues, x, y);
        dfs(root.right, depth, cousinsValues, x, y);
    }
}
