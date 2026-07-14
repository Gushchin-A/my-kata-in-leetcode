/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int maximumDeph = 0;
        for (Node child : root.children) {
            int candidate = maxDepth(child);
            maximumDeph = Math.max(maximumDeph, candidate);
        }

        return 1 + maximumDeph;
    }
}
