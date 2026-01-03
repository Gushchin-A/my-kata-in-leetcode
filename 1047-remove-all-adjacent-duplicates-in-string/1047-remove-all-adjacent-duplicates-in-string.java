class Solution {
    public String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!result.isEmpty()) {
                if (c == result.charAt(result.length() - 1)) {
                 result.setLength(result.length() - 1);
                } else {
                    result.append(c);
                }
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}