class Solution {
    public String generateTheString(int n) {
        String firstLetter = "a";
        String secondLetter = "b";

        StringBuilder result = new StringBuilder(n);
        if (n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                result.append(firstLetter);
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                result.append(firstLetter);
            }
            result.append(secondLetter);
        }

        return result.toString();
    }
}