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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafsList1 = new ArrayList<>();
        List<Integer> leafsList2 = new ArrayList<>();

        dfs(root1, leafsList1);
        dfs(root2, leafsList2);

        return leafsList1.equals(leafsList2);
    }

    private void dfs(TreeNode root, List<Integer> leafsList) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            leafsList.add(root.val);
        } else {
            dfs(root.left, leafsList);
            dfs(root.right, leafsList);
        }
    }
}
