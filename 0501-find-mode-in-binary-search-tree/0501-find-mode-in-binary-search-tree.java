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
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        dfs(root, map);

        int count = 0;
        int maxCount = 0;
        for (int value : map.values()) {
            if (value > maxCount) {
                count = 1;
                maxCount = value;
            } else if (value == maxCount) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                result[index++] = entry.getKey();
            }
        }

        return result;
    }

    private void dfs(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) {
            return;
        }

        dfs(root.left, map);
        map.merge(root.val, 1, Integer::sum);
        dfs(root.right, map);     
    }
}
