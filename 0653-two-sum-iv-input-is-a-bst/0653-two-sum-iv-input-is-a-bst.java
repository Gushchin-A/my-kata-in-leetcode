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
        int[] values = new int[dfsSize(root)];

        getValuesInArrayDfs(root, values, new int[]{0});

        int left = 0;
        int right = values.length - 1;
        while (left < right) {
            if (values[left] + values[right] == k) {
                return true;
            }

            if (values[left] + values[right] < k) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    private void getValuesInArrayDfs(TreeNode root, int[] values, int[] index) {
        if (root == null) {
            return;
        }

        getValuesInArrayDfs(root.left, values, index);
        values[index[0]++] = root.val;
        getValuesInArrayDfs(root.right, values, index);
    }

    private int dfsSize(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + dfsSize(root.left) + dfsSize(root.right);
    }
}
