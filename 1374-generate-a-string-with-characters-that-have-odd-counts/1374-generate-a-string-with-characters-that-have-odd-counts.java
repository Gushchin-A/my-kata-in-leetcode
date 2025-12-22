class Solution {
    public String generateTheString(int n) {
        StringBuilder result = new StringBuilder(n);
        result.append("a".repeat(Math.max(0, n)));

        if (n % 2 == 0) {
            result.setCharAt(0, 'b');
        }

        return result.toString();
    }
}