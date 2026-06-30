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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> values = new ArrayList<>();

        getValuesInArrayDfs(root, values);

        int left = 0;
        int right = values.size() - 1;
        while (left < right) {
            if (values.get(left) + values.get(right) == k) {
                return true;
            }

            if (values.get(left) + values.get(right) < k) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    private void getValuesInArrayDfs(TreeNode root, List<Integer> values) {
        if (root == null) {
            return;
        }

        getValuesInArrayDfs(root.left, values);
        values.add(root.val);
        getValuesInArrayDfs(root.right, values);
    }
}
