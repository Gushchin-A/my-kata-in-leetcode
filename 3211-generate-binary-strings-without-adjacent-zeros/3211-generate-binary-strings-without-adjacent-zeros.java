class Solution {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        backtrack(n, current, result);

        return result;
    }

    private void backtrack(int n, StringBuilder current, List<String> result) {
        if (current.length() == n) {
            result.add(current.toString());
            return;
        }

        if (current.isEmpty() || current.charAt(current.length() - 1) != '0') {
            current.append('0');
            backtrack(n, current, result);
            current.setLength(current.length() - 1);
        }

        current.append('1');
        backtrack(n, current, result);
        current.setLength(current.length() - 1);
    }
}
