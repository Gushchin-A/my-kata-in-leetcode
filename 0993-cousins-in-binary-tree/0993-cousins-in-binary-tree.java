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
        Map<String, Integer> cousinX = new HashMap<>();
        Map<String, Integer> cousinY = new HashMap<>();

        cousinX.put("parent", root.val);
        cousinY.put("parent", root.val);

        dfs(root, 0, cousinX, x);
        dfs(root, 0, cousinY, y);

        return cousinX.get("depth") == cousinY.get("depth") && cousinX.get("parent") != cousinY.get("parent");
    }

    private void dfs(TreeNode root, int depth, Map<String, Integer> cousinValues, int target) {
        if (root == null || cousinValues.containsKey("depth")) {
            return;
        }

        depth++;
        
        if (root.val == target) {
            cousinValues.put("depth", depth);
            return;
        }

        dfs(root.left, depth, cousinValues, target);
        if (cousinValues.containsKey("depth") && cousinValues.get("depth") == depth + 1) {
            cousinValues.put("parent", root.val);
            return;
        }

        dfs(root.right, depth, cousinValues, target);
        if (cousinValues.containsKey("depth") && cousinValues.get("depth") == depth + 1) {
            cousinValues.put("parent", root.val);
            return;
        }
    }
}
