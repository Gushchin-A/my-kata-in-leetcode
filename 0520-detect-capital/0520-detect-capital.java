class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int upper = 0;

        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c)) {
                upper++;
            }
        }

        if (upper == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        } else if (upper == n || upper == 0) {
            return true;
        } else {
            return false;
        }
    }
}
