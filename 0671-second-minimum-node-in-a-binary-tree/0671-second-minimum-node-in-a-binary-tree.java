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
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        dfsCreateList(root, list);

        Collections.sort(list);

        return list.size() == 1 ? -1 : list.get(1);
    }

    private void dfsCreateList(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        if (!list.contains(root.val)) {
            list.add(root.val);
        }
        
        dfsCreateList(root.left, list);
        dfsCreateList(root.right, list);
    }
}
