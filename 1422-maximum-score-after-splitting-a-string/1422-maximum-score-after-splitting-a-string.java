class Solution {
    public int maxScore(String s) {
        int n = s.length();

        int sumRight = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                sumRight++;
            }
        }

        int max = 0;
        int sumLeft = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                sumLeft++;
            } else {
                sumRight--;
            }

            max = Math.max(max, sumLeft + sumRight);
        }

        return max;
    }
}