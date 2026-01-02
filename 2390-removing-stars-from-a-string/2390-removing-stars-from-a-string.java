class Solution {
    public String removeStars(String s) {
        int n = s.length();

        StringBuilder result = new StringBuilder();
        int mustMiss = 0;
        for (int i = n - 1; i >= 0; i--) {
            char current = s.charAt(i);
            if (current == '*') {
                mustMiss++;
            } else {
                if (mustMiss == 0) {
                    result.append(current);
                } else {
                    mustMiss--;
                }
            }
        }

        return result.reverse().toString();
    }
}