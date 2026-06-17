/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        List<TreeNode> result = new ArrayList<>();
        dfs(original, cloned, target, result);

        return result.getFirst();
    }

    private void dfs(final TreeNode original, final TreeNode cloned, final TreeNode target, List<TreeNode> result) {
        if (original == null) {
            return;
        }

        if (original.val == target.val) {
            result.add(cloned);
            return;
        } else {
            dfs(original.left, cloned.left, target, result);
            dfs(original.right, cloned.right, target, result);
        }
    }
}