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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> line = new ArrayDeque<>();

        line.offer(root);

        while (!line.isEmpty()) {
            int sizeLine = line.size();
            double sum = 0;

            for (int i = 0; i < sizeLine; i++) {
                TreeNode node = line.poll();
                sum += node.val;

                if (node.left != null) {
                    line.offer(node.left);
                }
                if (node.right != null) {
                    line.offer(node.right);
                }
            }

            double average = sum / sizeLine;
            result.add(average);
        }

        return result;
    }
}
