class Solution {
    public boolean rotateString(String s, String goal) {
        int n = goal.length();

        if (n != s.length()) {
            return false;
        }

        for (int shift = 0; shift < n; shift++) {
            boolean match = true;

            for (int i = 0; i < n; i++) {
                char shiftChar = s.charAt((i + shift) % s.length());
                char goalChar = goal.charAt(i);
                if (shiftChar != goalChar) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return true;
            }
        }

        return false;
    }
}