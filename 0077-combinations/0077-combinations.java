class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        int start = 1;

        backtrack(n, k, start, result, current);

        return result;

    }

    private void backtrack(int n, int k, int start, List<List<Integer>> result, List<Integer> current) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n; i++) {
            current.add(i);
            backtrack(n, k, i + 1, result, current);
            current.removeLast();
        }
    }
}
