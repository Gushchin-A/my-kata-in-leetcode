class Solution {
    public String reversePrefix(String s, int k) {
        int n = s.length();
        StringBuilder result = new StringBuilder(n);

        for (int i = k - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }

        for (int i = k; i < n; i++) {
            result.append(s.charAt(i));
        }

        return result.toString();
    }
}