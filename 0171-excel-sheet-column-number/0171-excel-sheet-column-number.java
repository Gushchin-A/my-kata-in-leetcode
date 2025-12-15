class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int maxLetters = 26;

        int result = 0;
        for (int i = 0; i < n; i++) {
            int digit = Character.toLowerCase(columnTitle.charAt(i)) - 'a' + 1;
            result = result * maxLetters + digit;
        }

        return result;
    }
}