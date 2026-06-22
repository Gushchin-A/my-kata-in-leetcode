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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> listTree = new ArrayList<>();
        getInOrderValuesFromTree(root, listTree);

        return buildBalanceBinaryTree(listTree, 0, listTree.size() - 1);
    }

    private void getInOrderValuesFromTree(TreeNode root, List<Integer> listTree) {
        if (root == null) {
            return;
        }

        getInOrderValuesFromTree(root.left, listTree);
        
        listTree.add(root.val);

        getInOrderValuesFromTree(root.right, listTree);
    } 

    private TreeNode buildBalanceBinaryTree(List<Integer> listTree, int left, int right) {
        if (left > right) {
            return null;
        }

        int medium = (left + right) / 2;
        TreeNode root = new TreeNode(listTree.get(medium));

        root.left = buildBalanceBinaryTree(listTree, left, medium - 1);
        root.right = buildBalanceBinaryTree(listTree, medium + 1, right);

        return root;
    }
}