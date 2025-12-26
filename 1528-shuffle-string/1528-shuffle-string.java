class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();

        char[] normalized = new char[n];
        for (int i = 0; i < n; i++) {
            char current = s.charAt(i);
            normalized[indices[i]] = current;
        }

        StringBuilder result = new StringBuilder(n);
        for (char c : normalized) {
            result.append(c);
        }

        return result.toString();
    }
}