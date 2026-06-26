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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        backtracking(root, targetSum, tempList, result);

        return result;
    }

    private void backtracking(TreeNode root, int targetSumBalance, List<Integer> tempList, List<List<Integer>> result) {
        if (root == null) {
            return;
        }

        tempList.add(root.val);
        targetSumBalance -= root.val;

        if (root.left == null && root.right == null && targetSumBalance == 0) {
            result.add(new ArrayList(tempList));
        } else {
            backtracking(root.left, targetSumBalance, tempList, result);
            backtracking(root.right, targetSumBalance, tempList, result);
        }

        tempList.removeLast();
    }
}
