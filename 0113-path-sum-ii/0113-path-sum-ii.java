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
    List<List<Integer>> result;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        dfs(root, targetSum, tempList);

        return result;
    }

    private void dfs(TreeNode root, int targetSumBalance, List<Integer> tempList) {
        if (root == null) {
            return;
        }

        tempList.add(root.val);
        targetSumBalance -= root.val;

        if (root.left == null && root.right == null) {
            if (targetSumBalance == 0) {
                result.add(new ArrayList<>(tempList));
                tempList.removeLast();
                return;
            } else {
                tempList.removeLast();
                return;
            }
        }

        dfs(root.left, targetSumBalance, tempList);
        dfs(root.right, targetSumBalance, tempList);
        tempList.removeLast();
    }
}
