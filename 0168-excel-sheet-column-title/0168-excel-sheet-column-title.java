class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        int n = columnNumber;
        while (n > 0) {
            n = n - 1;
            char l = (char) (n % 26 + 'A');
            result.append(l);
            n = n / 26;
        }

        return result.reverse().toString();
    }
}