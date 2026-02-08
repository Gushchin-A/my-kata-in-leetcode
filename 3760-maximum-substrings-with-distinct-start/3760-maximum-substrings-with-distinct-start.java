class Solution {
    public int maxDistinct(String s) {
        boolean[] seen = new boolean[26];

        int result = 0;
        for (char c : s.toCharArray()) {
            if (!seen[c - 'a']) {
                result++;
            }
            seen[c - 'a'] = true;
        }

        return result;
    }
}