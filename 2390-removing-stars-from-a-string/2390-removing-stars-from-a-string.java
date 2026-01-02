class Solution {
    public String removeStars(String s) {
        int n = s.length();

        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '*') {
                result.append(c);
            } else {
                result.setLength(result.length() - 1);
            }
        }

        return result.toString();
    }
}